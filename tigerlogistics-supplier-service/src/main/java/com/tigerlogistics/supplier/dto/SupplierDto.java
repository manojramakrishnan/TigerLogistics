package com.tigerlogistics.supplier.dto;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SupplierDto {
	@NotNull
	private Long supplierId;
	private String name;
	private String location;
	private String phoneNo;
	
}
