package com.tigerlogistics.stockmanagement.service;

import java.util.Map;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;

public interface StockManagementService {

	Product addProduct(Product product);

	ProductDto fetchProductById(long id);

}
