package com.tigerlogistics.stockmanagement.service.impl;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.stockmanagement.dto.ProductAddRequest;
import com.tigerlogistics.stockmanagement.helper.StockManagementMapper;
import com.tigerlogistics.stockmanagement.repository.StockManagementRepository;
import com.tigerlogistics.stockmanagement.service.StockManagementService;


@Service
public class StockManagementServiceImpl implements StockManagementService{

	@Autowired
	private StockManagementRepository stockManagementRepository;

	@Override
	public Map<String, String> addProduct(ProductAddRequest productAddRequest) {
		// TODO Auto-generated method stub
		return Collections.singletonMap("productOrderId", this.stockManagementRepository.save(StockManagementMapper
				.DtoToEntity(productAddRequest)).getProductOrderId().toString());
	
	}

}
