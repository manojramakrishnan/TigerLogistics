package com.tigerlogistics.productorder.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tigerlogistics.productorder.dto.ProductDetailsDTO;
import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.helper.ProductOrderMapper;
import com.tigerlogistics.productorder.repository.ProductDetailsRepository;
import com.tigerlogistics.productorder.repository.ProductOrderRepository;
import com.tigerlogistics.productorder.service.ProductOrderService;



@Service
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	private ProductOrderRepository orderRepository;
	
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	
	@Override
	public Map<String,String> createProductOrder(ProductOrderRequest productOrderRequest) {
		
		return Collections.singletonMap("productOrderId", this.orderRepository.save(ProductOrderMapper
				.DtoToEntity(productOrderRequest)).getProductOrderId().toString());
	}


	@Override
	@Transactional(readOnly = true)
	public List<ProductDetailsDTO> fetchAllProducts() {
		// TODO Auto-generated method stub
		return productDetailsRepository.findAll().stream().map(ProductOrderMapper::productDetailsToDto).collect(Collectors.toList());
	}


	
	

}
