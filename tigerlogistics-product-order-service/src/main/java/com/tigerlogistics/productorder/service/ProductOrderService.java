package com.tigerlogistics.productorder.service;

import java.util.Map;

import com.tigerlogistics.productorder.dto.ProductOrderRequest;

public interface ProductOrderService {

	Map<String,String> create(ProductOrderRequest productOrderRequest);


}
