package com.tigerlogistics.stockmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.stockmanagement.repository.StockManagementRepository;
import com.tigerlogistics.stockmanagement.service.StockManagementService;


@Service
public class StockManagementServiceImpl implements StockManagementService{

	@Autowired
	private StockManagementRepository stockManagementRepository;

}
