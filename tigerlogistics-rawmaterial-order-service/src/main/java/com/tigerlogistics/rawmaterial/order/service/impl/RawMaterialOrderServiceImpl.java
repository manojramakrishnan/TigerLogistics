package com.tigerlogistics.rawmaterial.order.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderDto;
//import com.tigerlogistics.auth.helper.UserDetailMapper;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderResponse;
import com.tigerlogistics.rawmaterial.order.dto.UpdateStatusDTO;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterial;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterialOrder;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterialStockRequest;
import com.tigerlogistics.rawmaterial.order.enums.OrderStatus;
import com.tigerlogistics.rawmaterial.order.exception.InvalidOrderUpdateStatusException;
import com.tigerlogistics.rawmaterial.order.helper.RawMaterialMapper;
import com.tigerlogistics.rawmaterial.order.repository.RawMaterialOrderRepository;
import com.tigerlogistics.rawmaterial.order.repository.RawMaterialRepository;
import com.tigerlogistics.rawmaterial.order.service.RawMaterialOrderService;
import com.tigerlogistics.rawmaterial.order.service.UpdateRawMaterialOrderService;

@Service
public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {
	@Autowired
	private RawMaterialOrderRepository repository;
	@Autowired
	private UpdateRawMaterialOrderService updateRawMaterialOrderService;
	@Autowired
	private RawMaterialRepository rawMaterialRepository;

	@Override
	public Map<String, String> createOrder(RawMaterialOrderRequest rawMaterialOrderRequest) {
		// TODO Auto-generated method stub
		return Collections.singletonMap("rawMaterialOrderId", repository
				.save(RawMaterialMapper.DtoToEntity(rawMaterialOrderRequest)).getRawMaterialOrderId().toString());
	}

	@Override

	public List<RawMaterialOrderResponse> fetchAllOrders() {
		RawMaterialMapper mapper = new RawMaterialMapper();
		return this.repository.findAll().stream().map(mapper::entityToDto).collect(Collectors.toList());
	}

	@Override
	public RawMaterialOrderResponse fetchRawMaterialOrderByID(long rawMaterialOrderId) {
		RawMaterialMapper mapper = new RawMaterialMapper();
		return mapper.entityToDto(this.repository.findByRawMaterialOrderId(rawMaterialOrderId));
	}

	

	@Override
	public RawMaterial updateRawMaterialOrderDeliveryStatus(RawMaterialStockRequest request) {
		// TODO Auto-generated method stub
		RawMaterial rawMaterial=rawMaterialRepository.findRawMaterialById(request.getRawMaterialId());
		
		rawMaterial.setQuantityAvailabe(rawMaterial.getQuantityAvailabe()+request.getQuantity());
		return rawMaterialRepository.save(rawMaterial);
	}

}
