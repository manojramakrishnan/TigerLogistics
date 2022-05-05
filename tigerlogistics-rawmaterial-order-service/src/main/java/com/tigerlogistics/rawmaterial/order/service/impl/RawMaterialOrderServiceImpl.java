package com.tigerlogistics.rawmaterial.order.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderDto;
//import com.tigerlogistics.auth.helper.UserDetailMapper;
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
	@Override

	public List<RawMaterialOrderDto> fetchAllOrders() {
		return repository.findAll().stream().map(RawMaterialMapper::orderDetailstoDto).collect(Collectors.toList());
	}
	@Override
	public RawMaterialOrderDto fetchRawMaterialOrderByID(long rawMaterialOrderId) {
		// TODO Auto-generated method stub
		return RawMaterialMapper.orderDetailstoDto(repository.findByRawMaterialOrderId(rawMaterialOrderId));
	}
	

}
