package com.tigerlogistics.productorder.dto;

import java.time.LocalDate;

import com.tigerlogistics.productorder.entity.Distributor;
import com.tigerlogistics.productorder.entity.Product;
import com.tigerlogistics.productorder.enums.OrderStatus;
import com.tigerlogistics.productorder.enums.QualityCheck;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDetailsDTO {

	private Long productOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	
}
