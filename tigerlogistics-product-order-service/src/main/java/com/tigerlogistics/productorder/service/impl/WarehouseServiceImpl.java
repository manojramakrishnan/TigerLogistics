package com.tigerlogistics.productorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.productorder.dto.WarehouseDto;
import com.tigerlogistics.productorder.entity.Warehouse;
import com.tigerlogistics.productorder.helper.WarehouseMapper;
import com.tigerlogistics.productorder.repository.WarehouseRepository;
import com.tigerlogistics.productorder.service.WarehouseService;

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
