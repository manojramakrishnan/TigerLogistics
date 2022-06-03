package com.tigerlogistics.stockmanagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.helper.ProductDetailMapper;
import com.tigerlogistics.stockmanagement.repository.ProductRepository;
import com.tigerlogistics.stockmanagement.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public ProductDto fetchProductsById(long productId) {
		// TODO Auto-generated method stub
		return ProductDetailMapper.entityToDto(productRepository.findProductById(productId));
	}

	@Override
	public List<ProductDto> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll().stream().map(ProductDetailMapper::entityToDto).collect(Collectors.toList());
	}

}
