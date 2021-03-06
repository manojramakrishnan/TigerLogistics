package com.tigerlogistics.main.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tigerlogistics.main.model.Model;
import com.tigerlogistics.main.service.SupplyChainReadOnlyService;


public class ReadOnlyRestController<T extends Model<U>,U extends Serializable> {
	
	private SupplyChainReadOnlyService<T,U> supplyChainReadOnlyService;
	
	public ReadOnlyRestController(SupplyChainReadOnlyService<T,U> readOnlyService) {
		
		this.supplyChainReadOnlyService=readOnlyService;
	}
	@RequestMapping(value="{id}",method=RequestMethod.GET,produces="application/json; charset=UTF-8")
	public GlobalResponseDto<T> getById(@PathVariable U id){
		GlobalResponseDto<T> response=new GlobalResponseDto<>("unable to obtain a single record by id"+ id);
		try {
			T entity=supplyChainReadOnlyService.getById(id);
			if (entity == null) {
				response=new GlobalResponseDto<>("entity not found with id"+ id);
				else {
					response=new GlobalResponseDto<>(entity);
				}
			}
			catch(Exception e){
				response=new GlobalResponseDto<>(e.getMessage());
				
			}
			return response;
		}
	}
	
}
