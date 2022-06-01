package com.tigerlogistics.stockmanagement.service;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;

public interface ProductService {
	

	Product addProduct(Product product);

	ProductDto fetchProductsById(long productId);

}
