package com.tigerlogistics.productorder.service;

import java.util.List;
import java.util.Map;

import com.tigerlogistics.productorder.dto.ProductDetailsDTO;
import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.dto.ProductOrderResponse;

public interface ProductOrderService {

	Map<String,String> createProductOrder(ProductOrderRequest productOrderRequest);

	List<ProductOrderResponse> fetchAllProductOrders();


}
