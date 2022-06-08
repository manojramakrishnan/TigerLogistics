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
import com.tigerlogistics.rawmaterial.order.entity.RawMaterialOrder;
import com.tigerlogistics.rawmaterial.order.enums.OrderStatus;
import com.tigerlogistics.rawmaterial.order.exception.InvalidOrderUpdateStatusException;
import com.tigerlogistics.rawmaterial.order.helper.RawMaterialMapper;
import com.tigerlogistics.rawmaterial.order.repository.RawMaterialOrderRepository;
import com.tigerlogistics.rawmaterial.order.service.RawMaterialOrderService;
import com.tigerlogistics.rawmaterial.order.service.UpdateRawMaterialOrderService;

@Service
public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {
	@Autowired
	private RawMaterialOrderRepository repository;
	@Autowired
	private UpdateRawMaterialOrderService updateRawMaterialOrderService;

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
	public RawMaterialOrderResponse updateRawMaterialOrderDeliveryStatus(UpdateStatusDTO updateStatusDTO) {
		// TODO Auto-generated method stub
		RawMaterialOrder order = repository.findByRawMaterialOrderId(updateStatusDTO.getOrderId());
		if (order.getOrderStatus().equals(OrderStatus.Delivered)) {
			throw new InvalidOrderUpdateStatusException("Status", "rawmaterial already delivered");
		}
		if (order.getOrderStatus().equals(OrderStatus.Cancelled)) {
			throw new InvalidOrderUpdateStatusException("Status", "rawmaterial delivery already cancelled");
		}
		if (updateStatusDTO.getStatus().equals(OrderStatus.Delivered.toString())) {
			order.setOrderStatus(OrderStatus.valueOf(updateStatusDTO.getStatus()));
		}
		if (updateStatusDTO.getStatus().equals(OrderStatus.Cancelled.toString())) {
			order.setOrderStatus(OrderStatus.valueOf(updateStatusDTO.getStatus()));
		}
		if (updateRawMaterialOrderService.updateRawMaterialStock(order.getRawMaterial().getRawMaterialId(),
				order.getQuantity())) {
			RawMaterialMapper mapper = new RawMaterialMapper();
			return mapper.entityToDto(this.repository.save(order));
		} else {
			throw new RuntimeException("error updating stock");
		}
	}

}
