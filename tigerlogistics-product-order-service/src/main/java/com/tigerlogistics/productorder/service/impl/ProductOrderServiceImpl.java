package com.tigerlogistics.productorder.service.impl;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.helper.ProductOrderMapper;
import com.tigerlogistics.productorder.repository.ProductOrderRepository;
import com.tigerlogistics.productorder.service.ProductOrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	private ProductOrderRepository orderRepository;
	
	
	@Override
	public Map<String,String> create(ProductOrderRequest productOrderRequest) {
		// TODO Auto-generated method stub
		return Collections.singletonMap("productOrderId", this.orderRepository.save(ProductOrderMapper
				.DtoToEntity(productOrderRequest)).getProductOrderId().toString());
	}

}
