package com.tigerlogistics.stockmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.helper.StockDetailMapper;
import com.tigerlogistics.stockmanagement.repository.StockManagementRepository;
import com.tigerlogistics.stockmanagement.service.StockManagementService;


@Service
public class StockManagementServiceImpl implements StockManagementService{

	@Autowired
	private StockManagementRepository stockManagementRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return stockManagementRepository.save(product);
	
	}

	@Override
	public ProductDto fetchProductById(long productId) {
		// TODO Auto-generated method stub
		return StockDetailMapper.entityToDto(stockManagementRepository.findProductById(productId));
	}

}
