package com.tigerlogistics.supplier.dto;

import java.time.LocalDate;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierDto {
	private Long SupplierId;
	private String Name;
	private String Location;
	private String PhoneNo;
	
}
