package com.tigerlogistics.rawmaterial.order.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RawMaterialOrderRequest {

	@NotNull
	@Min(1000000)
	@Max(9999999)
	private Long rawMaterialId;
	@NotNull
	@DecimalMax(value = "999.999")
	private double quantity;
	@NotNull
	@DecimalMax(value = "9999.999")
	private double pricePerUnit;
	@Pattern(regexp = "^(Passed|Failed)$", message = "Must be either passed or failed")
	private String qualityCheck;
	@NotNull
	@Future
	private LocalDate deliveryDate;
	@NotNull
	@Future
	private LocalDate expiryDate;
	@NotNull
	private Long supplierId;
}
