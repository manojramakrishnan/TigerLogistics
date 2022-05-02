package com.tigerlogistics.productorder.dto;

import com.tigerlogistics.productorder.entity.Warehouse;
import com.tigerlogistics.productorder.enums.MeasurementUnit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDetailsDTO {

	private Long productId;
	private String materialName;
	private String description;
	private Double quantityAvailable;
	private MeasurementUnit quantityUnit;
	private Warehouse warehouse;

}
