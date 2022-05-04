package com.tigerlogistics.productorder.dto;

import java.time.LocalDate;

import com.tigerlogistics.productorder.entity.Warehouse;
import com.tigerlogistics.productorder.enums.MeasurementUnit;
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
public class ProductOrderResponse {

	private Long productOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	private String distributorName;
	private Long distributorId;
	private String productName;
	private String description;
	private MeasurementUnit measurementUnit;
	private Warehouse warehouse;
	private Long productId;
}
