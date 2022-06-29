package com.tigerlogistics.supplier.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateSupplierDto {
	@NotNull
	private Long supplierId;
	private String name;
	private String location;
	private String phoneNo;

}
