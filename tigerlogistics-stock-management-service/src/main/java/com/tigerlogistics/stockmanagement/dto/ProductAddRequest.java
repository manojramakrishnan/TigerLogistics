package com.tigerlogistics.stockmanagement.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;


import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAddRequest {

	@NotNull
	@Min(100000)
	@Max(999999)
	private Long productId;
	@NotNull
	@DecimalMax(value = "9999.999")
	private Double quantity;
	@NotNull
	@DecimalMax(value = "9999.999")
	private Double pricePerUnit;
	@Pattern(regexp = "^(Passed|Failed)$", message = "Must be either passed or failed")
	private String qualityCheck;
	@NotNull
	@Future
	private LocalDate deliveryDate;
	@NotNull
	@Future
	private LocalDate expiryDate;
	@NotNull
	@Past
	private LocalDate manufactureDate;
	@NotNull
	@Min(100000)
	@Max(999999)
	private Long distributorId;

}
