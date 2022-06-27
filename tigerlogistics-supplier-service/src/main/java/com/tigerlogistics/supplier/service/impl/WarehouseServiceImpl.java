package com.tigerlogistics.supplier.service.impl;

import java.util.List;

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
		
		return warehouseRepository.save(WarehouseMapper.warehouseDtoToEntity(warehouseDto));
	}

	@Override
	public List<Warehouse> fetchAllWarehouses() {
	
		return warehouseRepository.findAll();
	}

	
	@Override
	public Warehouse fetchAllWarehousesById(long warehouseId) {
		return warehouseRepository.findByWarehouseId(warehouseId);
	}

}
