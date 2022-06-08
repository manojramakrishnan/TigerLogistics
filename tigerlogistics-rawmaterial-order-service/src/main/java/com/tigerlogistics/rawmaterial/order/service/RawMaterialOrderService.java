package com.tigerlogistics.rawmaterial.order.service;

import java.util.List;
import java.util.Map;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderResponse;
import com.tigerlogistics.rawmaterial.order.dto.UpdateStatusDTO;

public interface RawMaterialOrderService {
	Map<String,String> createOrder(RawMaterialOrderRequest rawMaterialOrderRequest);

	List<RawMaterialOrderResponse> fetchAllOrders();

	RawMaterialOrderResponse fetchRawMaterialOrderByID(long rawMaterialOrderId);

	RawMaterialOrderResponse updateRawMaterialOrderDeliveryStatus(UpdateStatusDTO updateStatusDTO);
}
