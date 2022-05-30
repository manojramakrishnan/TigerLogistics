package com.tigerlogistics.stockmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.stockmanagement.service.ProductControllerService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins="*")
public class ProductController {
	@Autowired
	ProductControllerService productControllerService;

}
