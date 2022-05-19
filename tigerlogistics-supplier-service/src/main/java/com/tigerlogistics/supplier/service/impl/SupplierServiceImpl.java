package com.tigerlogistics.supplier.service.impl;
//
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.repository.SupplierRepository;
import com.tigerlogistics.supplier.service.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService{
@Autowired
private SupplierRepository supplierRepository;

@Override
public Map<String, String> addSupplier(SupplierDto supplierDto) {
	// TODO Auto-generated method stub
	return null;
}
}
