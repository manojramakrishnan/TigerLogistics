package com.tigerlogistics.stockmanagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.entity.ProductStockRequest;
import com.tigerlogistics.stockmanagement.helper.StockDetailMapper;
import com.tigerlogistics.stockmanagement.repository.StockManagementRepository;
import com.tigerlogistics.stockmanagement.service.StockManagementService;


@Service
public class StockManagementServiceImpl implements StockManagementService{

	@Autowired
	private StockManagementRepository stockManagementRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return stockManagementRepository.save(product);
	
	}

	@Override
	public ProductDto fetchProductById(long productId) {
		// TODO Auto-generated method stub
		return StockDetailMapper.entityToDto(stockManagementRepository.findProductById(productId));
	}

	@Override
	public List<ProductDto> findAllProducts() {
		// TODO Auto-generated method stub
		return stockManagementRepository.findAll().stream().map(StockDetailMapper::entityToDto).collect(Collectors.toList());
	}

	@Override
	public Product updateProductStock(ProductStockRequest productStockRequest) {
		// TODO Auto-generated method stub
		
		Product fetchProduct =stockManagementRepository.findProductById(productStockRequest.getProductId());
		fetchProduct.setQuantityAvailable(fetchProduct.getQuantityAvailable() + productStockRequest.getQuantity());
		return stockManagementRepository.save(fetchProduct);

	}

}
