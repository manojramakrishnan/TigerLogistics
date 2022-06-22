package com.tigerlogistics.supplier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.supplier.dto.WarehouseDto;
import com.tigerlogistics.supplier.entity.Warehouse;
import com.tigerlogistics.supplier.helper.WarehouseMapper;
import com.tigerlogistics.supplier.repository.WarehouseRepository;
import com.tigerlogistics.supplier.service.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService{
	@Autowired
	private WarehouseRepository warehouseRepository;

	@Override
	public Warehouse addWarehouse(WarehouseDto warehouseDto) {
		// TODO Auto-generated method stub
		return warehouseRepository.save(WarehouseMapper.warehouseDtoToEntity(warehouseDto));
	}

}
