package com.tigerlogistics.stockmanagement.entity;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockRequest {
	
	@NotNull
	private long productId;
	
	@NotNull
	@DecimalMax(value="999.99")
	private double quantity;

}
