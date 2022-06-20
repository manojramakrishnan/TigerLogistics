package com.tigerlogistics.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.supplier.dto.DistributorDto;
import com.tigerlogistics.supplier.entity.Distributor;
import com.tigerlogistics.supplier.service.DistributorService;

@RestController
@RequestMapping("/distributor")
@CrossOrigin(origins = "*")
public class DistributorController {

	@Autowired
	private DistributorService distributorService;
	
	@PostMapping
	public ResponseEntity<Distributor> addDistributor(@RequestBody Distributor distributor){
		return ResponseEntity.status(HttpStatus.CREATED).body(distributorService.addDistributor(distributor));
	}
	@GetMapping("/fetchalldistributors")
	public ResponseEntity<List<Distributor>> fetchAllDistributor(){
		return ResponseEntity.status(HttpStatus.OK).body(distributorService.fetchAllDistributor());
		
		
	}
	
}
