package com.tigerlogistics.rawmaterial.order.dto;

import java.time.LocalDate;

import com.tigerlogistics.rawmaterial.order.entity.RawMaterial;
import com.tigerlogistics.rawmaterial.order.entity.Supplier;
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
public class RawMaterialOrderDto {
	private Long rawMaterialOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	private Supplier supplier;
	private RawMaterial rawMaterial;


}
