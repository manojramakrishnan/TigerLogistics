package com.tigerlogistics.supplier.service;

import java.util.Map;

import com.tigerlogistics.supplier.dto.SupplierDto;

//public interface SupplierService {
//
//}
public interface SupplierService {

	Map<String,String> addSupplier(SupplierDto supplierDto);

}
