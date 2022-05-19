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
		return Supplier.builder().Name(supplierDto.getName())
				.SupplierId(supplierDto.getSupplierId() != null ? supplierDto.getSupplierId() : null)
				.Location(supplierDto.getLocation()).PhoneNo(supplierDto.getPhoneNo()).build();
	}

}
