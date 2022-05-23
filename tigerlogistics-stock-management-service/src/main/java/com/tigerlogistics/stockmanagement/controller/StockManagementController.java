package com.tigerlogistics.stockmanagement.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.service.StockManagementService;


@RestController
@RequestMapping("/productStock")
@CrossOrigin(origins = "*")
public class StockManagementController {

	 @Autowired
	  StockManagementService stockManagementService;
	 
	 @PostMapping
		public ResponseEntity<Product> addProduct(
				 @RequestBody Product product) {
			return ResponseEntity.status(HttpStatus.OK)
					.body(this.stockManagementService.addProduct(product));
		}

}
