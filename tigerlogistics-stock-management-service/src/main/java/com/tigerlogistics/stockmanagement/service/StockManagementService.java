package com.tigerlogistics.stockmanagement.service;

import java.util.Map;

import com.tigerlogistics.stockmanagement.dto.ProductAddRequest;

public interface StockManagementService {

	Map<String, String> addProduct(ProductAddRequest productAddRequest);

}
