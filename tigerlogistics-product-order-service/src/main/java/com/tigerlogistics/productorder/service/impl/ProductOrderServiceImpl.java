package com.tigerlogistics.productorder.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tigerlogistics.productorder.dto.ProductDetailsDTO;
import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.dto.ProductOrderResponse;
import com.tigerlogistics.productorder.dto.UpdateStatusDTO;
import com.tigerlogistics.productorder.entity.ProductOrder;
import com.tigerlogistics.productorder.enums.OrderStatus;
import com.tigerlogistics.productorder.exception.InavlidOrderUpdateStatusException;
import com.tigerlogistics.productorder.helper.ProductOrderMapper;
import com.tigerlogistics.productorder.repository.ProductDetailsRepository;
import com.tigerlogistics.productorder.repository.ProductOrderRepository;
import com.tigerlogistics.productorder.service.ProductOrderService;
import com.tigerlogistics.productorder.service.UpdateStockService;



@Service
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	private ProductOrderRepository orderRepository;
	
	@Autowired
	private UpdateStockService updateStockService;
	
	@Override
	public Map<String,String> createProductOrder(ProductOrderRequest productOrderRequest) {
		
		return Collections.singletonMap("productOrderId", this.orderRepository.save(ProductOrderMapper
				.DtoToEntity(productOrderRequest)).getProductOrderId().toString());
	}


	@Override
	public List<ProductOrderResponse> fetchAllProductOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll().stream().map(ProductOrderMapper::entityToDto).collect(Collectors.toList());
	}


	@Override
	public ProductOrderResponse fetchProductById(long productOrderId) {
		// TODO Auto-generated method stub
		return ProductOrderMapper.entityToDto(orderRepository.findProductById(productOrderId));
	}


	@Override
	public ProductOrderResponse updateProductOrderDeliveryStatus(UpdateStatusDTO updateStatusDto) {
		// TODO Auto-generated method stub
		ProductOrder order =orderRepository.findByProductOrderId(updateStatusDto.getOrderId());
		
		if(order.getOrderStatus().equals(OrderStatus.Delivered)) {
			throw new InavlidOrderUpdateStatusException("Status","Product already delivered");
		}
		
		if(order.getOrderStatus().equals(OrderStatus.Cancelled)) {
			throw new InavlidOrderUpdateStatusException("Status", "Product delivery was already cancelled");
		}
	
		if(updateStatusDto.getStatus().equals(OrderStatus.Delivered.toString())) {
			order.setOrderStatus(OrderStatus.valueOf(updateStatusDto.getStatus()));
		}
		if(updateStatusDto.getStatus().equals(OrderStatus.Cancelled.toString())) {
			order.setOrderStatus(OrderStatus.valueOf(updateStatusDto.getStatus()));
		}
		if(updateStockService.updateProductStock(order.getProduct().getProductId(),order.getQuantity())) {
			ProductOrderMapper mapper = new ProductOrderMapper();
			return mapper.entityToDto(this.orderRepository.save(order));
		}
		else {
			throw new RuntimeException("error updating stock");
		}
	}


	
	

}
