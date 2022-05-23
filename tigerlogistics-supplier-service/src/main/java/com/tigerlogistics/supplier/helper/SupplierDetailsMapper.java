package com.tigerlogistics.supplier.helper;

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.entity.Supplier;

public class SupplierDetailsMapper {
	public static Supplier addToSupplier(SupplierDto supplierDto) {
		Supplier supplier = new Supplier();
		supplier.getSupplierId();
		supplier.getName();
		supplier.getLocation();
		supplier.getPhoneNo();
		return supplier;

	}

	public static Supplier supplierDtoToEntity(SupplierDto supplierDto) {
		// TODO Auto-generated method stub
		return Supplier.builder().name(supplierDto.getName())
				.supplierId(supplierDto.getSupplierId() != null ? supplierDto.getSupplierId() : null)
				.location(supplierDto.getLocation()).phoneNo(supplierDto.getPhoneNo()).build();
	}

}
