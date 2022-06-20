package com.tigerlogistics.supplier.service;


import java.util.List;

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.dto.UpdateSupplierDto;
import com.tigerlogistics.supplier.entity.Supplier;
//
//public interface SupplierService {
//
//}
public interface SupplierService {

	Supplier addSupplier(SupplierDto supplierDto);

	List<Supplier> fetchAllSupplier();

	Supplier fetchAllSupplierById(long supplierId);

	 void updateSupplier(UpdateSupplierDto updateSupplierDto);
		

}
