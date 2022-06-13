package com.tigerlogistics.rawmaterial.order.entity;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialStockRequest {
	@NotNull
	private Long rawMaterialId;
	@NotNull
	@DecimalMax(value="999.99")
	private Double quantity;

}
