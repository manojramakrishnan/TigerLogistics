package com.tigerlogistics.stockmanagement.dto;

import com.tigerlogistics.stockmanagement.entity.Warehouse;
import com.tigerlogistics.stockmanagement.enums.MeasurementUnit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

	private Long productId;
	  private String materialName;
	  private String description;
	  private Double quantityAvailable;
	  private MeasurementUnit quantityUnit;
	  private Warehouse warehouse;

}
