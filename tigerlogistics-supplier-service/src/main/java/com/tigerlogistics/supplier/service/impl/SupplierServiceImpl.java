package com.tigerlogistics.supplier.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.supplier.dto.SupplierDto;
import com.tigerlogistics.supplier.dto.UpdateSupplierDto;
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

	@Override
	public List<Supplier> fetchAllSupplier() {
		// TODO Auto-generated method stub
		return supplierRepository.findAll();
	}

	@Override
	public Supplier fetchAllSupplierById(long supplierId) {
		// TODO Auto-generated method stub
		return supplierRepository.findBySupplierId(supplierId);
	}

	@Override
	public void updateSupplier(SupplierDto supplierDto) {
		Supplier supplier=supplierRepository.findBySupplierId(supplierDto.getSupplierId());
		supplier.setLocation(supplierDto.getLocation());
		supplier.setName(supplierDto.getName());
		supplier.setPhoneNo(supplierDto.getPhoneNo());
		supplierRepository.save(supplier);
		
		
		
	}
}
