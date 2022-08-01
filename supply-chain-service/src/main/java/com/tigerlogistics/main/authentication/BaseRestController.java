package com.tigerlogistics.main.authentication;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tigerlogistics.main.dto.GlobalResponseDto;
import com.tigerlogistics.main.model.EditValidation;
import com.tigerlogistics.main.model.Model;
import com.tigerlogistics.main.service.SupplyChainService;

public abstract class BaseRestController<T extends Model<U>, U extends Serializable> extends ReadOnlyRestController<T,U>{
	
	private SupplyChainService<T,U> service;
	
	public BaseRestController(SupplyChainService<T, U> service) {
		super(service);
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json; charset=UTF-8", consumes = "application/json; charset=UTF-8")
	public GlobalResponseDto<T> add(@RequestBody(required = true) T entity) {
		GlobalResponseDto<T> response = new GlobalResponseDto<>("Unable to persist entity in database: " + entity);
		try {
			List<EditValidation> validationErrors = service.add(entity);
			if (validationErrors == null || validationErrors.isEmpty()) {
				response = new GlobalResponseDto<>(entity);
			} else {
				response = new GlobalResponseDto<>(entity, validationErrors);
			}
		} catch (Exception e) {
			response = new GlobalResponseDto<>(e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json; charset=UTF-8", consumes = "application/json; charset=UTF-8")
	public GlobalResponseDto<T> update(@RequestBody(required = true) T entity) {
		GlobalResponseDto<T> response = new GlobalResponseDto<>("Unable to merge entity in database: " + entity);
		try {
			List<EditValidation> validationErrors = service.update(entity);
			if (validationErrors == null || validationErrors.isEmpty()) {
				response = new GlobalResponseDto<>(entity);
			} else {
				response = new GlobalResponseDto<>(entity, validationErrors);
			}
		} catch (Exception e) {
			response = new GlobalResponseDto<>(e.getMessage());
		}

		return response;
	}


}
