package com.tigerlogistics.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseDto {
	private Long warehouseId;
	private String name;
	private String description;

}
