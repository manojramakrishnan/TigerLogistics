package com.tigerlogistics.productorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.productorder.dto.WarehouseDto;
import com.tigerlogistics.productorder.entity.Warehouse;
import com.tigerlogistics.productorder.service.WarehouseService;

@RestController
@RequestMapping("/warehouse")
@CrossOrigin(origins = "*")
public class WarehouseController {
	@Autowired
	private WarehouseService warehouseService;
	
	@PostMapping
	public ResponseEntity<Warehouse> addWarehouse(@RequestBody WarehouseDto warehouseDto ){
		return ResponseEntity.status(HttpStatus.CREATED).body(warehouseService.addWarehouse(warehouseDto));
		
	}

}
