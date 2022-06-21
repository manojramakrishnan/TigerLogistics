package com.tigerlogistics.productorder.dto;

import java.time.LocalDate;

import com.tigerlogistics.productorder.enums.OrderStatus;
import com.tigerlogistics.productorder.enums.QualityCheck;

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
