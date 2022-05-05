package com.tigerlogistics.rawmaterial.order.dto;

import java.time.LocalDate;

import com.tigerlogistics.rawmaterial.order.entity.Warehouse;
import com.tigerlogistics.rawmaterial.order.enums.MeasurementUnit;
import com.tigerlogistics.rawmaterial.order.enums.OrderStatus;
import com.tigerlogistics.rawmaterial.order.enums.QualityCheck;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RawMaterialOrderResponse {
	private Long rawMaterialOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	private Long supplierId;
	private String supplierName;
	private String materialName;
	private String description;
	private MeasurementUnit measurmentUnit;
	private Warehouse warehouse; 

}
