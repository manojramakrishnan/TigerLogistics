package com.tigerlogistics.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.supplier.dto.WarehouseDto;
import com.tigerlogistics.supplier.entity.Warehouse;
import com.tigerlogistics.supplier.service.WarehouseService;

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
	@GetMapping("/fetchallwarehouses")
	public ResponseEntity<List<Warehouse>> fetchAllWarehouses(){
		return ResponseEntity.status(HttpStatus.OK).body(warehouseService.fetchAllWarehouses());
	}
	@GetMapping("/{warehouseId}")
	public ResponseEntity<Warehouse> fetchAllWarehousesById(@PathVariable long warehouseId){
		return ResponseEntity.status(HttpStatus.OK).body(warehouseService.fetchAllWarehousesById(warehouseId));
	}
}
