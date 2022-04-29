package com.tigerlogistics.rawmaterial.order.service.impl;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;
import com.tigerlogistics.rawmaterial.order.helper.RawMaterialMapper;
import com.tigerlogistics.rawmaterial.order.repository.RawMaterialOrderRepository;
import com.tigerlogistics.rawmaterial.order.service.RawMaterialOrderService;
@Service
public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {
	@Autowired
	private RawMaterialOrderRepository repository;
	@Override
	public Map<String, String> createOrder(RawMaterialOrderRequest rawMaterialOrderRequest) {
		// TODO Auto-generated method stub
		return Collections.singletonMap("rawMaterialOrderId", repository.save(RawMaterialMapper.DtoToEntity(rawMaterialOrderRequest)).getRawMaterialOrderId().toString());
	}
	

}
