package com.tigerlogistics.stockmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.stockmanagement.service.StockManagementService;


@RestController
public class StockManagementController {

	 @Autowired
	  StockManagementService stockManagementService;

}
