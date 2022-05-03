package com.tigerlogistics.rawmaterial.order.service;

import java.util.List;
import java.util.Map;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderDto;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;

public interface RawMaterialOrderService {
	Map<String,String> createOrder(RawMaterialOrderRequest rawMaterialOrderRequest);

	List<RawMaterialOrderDto> fetchAllOrders();
}
