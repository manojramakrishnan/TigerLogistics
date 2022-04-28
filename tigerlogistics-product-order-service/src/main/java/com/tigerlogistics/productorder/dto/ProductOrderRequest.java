package com.tigerlogistics.productorder.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductOrderRequest {

	private Long productId;
	private Double quantity;
	private Double pricePerUnit;
	private String qualityCheck;
	private LocalDate deliveryDate;
	private LocalDate expiryDate;
	private LocalDate manufactureDate;
	private Long distributorId;

}
