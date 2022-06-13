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

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.entity.Supplier;
import com.tigerlogistics.supplier.service.SupplierService;

@RestController
@RequestMapping("/supplier")
@CrossOrigin(origins = "*")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@PostMapping
	public ResponseEntity<Supplier> addSupplier(@RequestBody SupplierDto supplierDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(supplierService.addSupplier(supplierDto));
	}
	@GetMapping("/fetchallsupplier")
	public ResponseEntity<List<Supplier>> fetchAllSupplier(){
		return ResponseEntity.status(HttpStatus.OK).body(supplierService.fetchAllSupplier());
		
		
	}
	@GetMapping("/{supplierId}")
	public ResponseEntity<Supplier> fetchAllSupplierById(@PathVariable long supplierId){
		return ResponseEntity.status(HttpStatus.OK).body(supplierService.fetchAllSupplierById(supplierId));
		
	}
}
