package com.tigerlogistics.stockmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.repository.ProductRepository;
import com.tigerlogistics.stockmanagement.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}