package com.tigerlogistics.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.supplier.service.DistributorService;

@RestController
@RequestMapping("/distributor")
@CrossOrigin(origins = "*")
public class DistributorController {

	@Autowired
	private DistributorService distributorService;
	
	
}
