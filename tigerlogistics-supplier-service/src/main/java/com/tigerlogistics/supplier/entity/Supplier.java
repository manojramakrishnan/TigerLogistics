package com.tigerlogistics.supplier.entity;

import javax.persistence.Entity;

import com.tigerlogistics.supplier.dto.SupplierDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Supplier {
	private Long SupplierId;
	private String Name;
	private String Location;
	private String PhoneNo;
	
}
