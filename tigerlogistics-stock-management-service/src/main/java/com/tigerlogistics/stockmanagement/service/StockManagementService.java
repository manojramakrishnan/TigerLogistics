package com.tigerlogistics.stockmanagement.service;

import java.util.List;
import java.util.Map;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;

public interface StockManagementService {

	Product addProduct(Product product);

	ProductDto fetchProductById(long productId);

	List<ProductDto> findAllProducts();

}
