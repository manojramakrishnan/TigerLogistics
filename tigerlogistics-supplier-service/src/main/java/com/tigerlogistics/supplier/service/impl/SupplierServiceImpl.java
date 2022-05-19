package com.tigerlogistics.supplier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.entity.Supplier;
import com.tigerlogistics.supplier.helper.SupplierDetailsMapper;
import com.tigerlogistics.supplier.repository.SupplierRepository;
import com.tigerlogistics.supplier.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public Supplier addSupplier(SupplierDto supplierDto) {

		return supplierRepository.save(SupplierDetailsMapper.supplierDtoToEntity(supplierDto));

	}
}
