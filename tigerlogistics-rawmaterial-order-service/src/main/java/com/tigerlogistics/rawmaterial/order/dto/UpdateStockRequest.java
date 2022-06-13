package com.tigerlogistics.rawmaterial.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStockRequest {
	private Long rawMaterialOrderId;
	private Double quantity;

}
