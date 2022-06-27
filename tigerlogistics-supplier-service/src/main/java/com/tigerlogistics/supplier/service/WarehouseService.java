package com.tigerlogistics.supplier.service;

import java.util.List;

import com.tigerlogistics.supplier.dto.WarehouseDto;
import com.tigerlogistics.supplier.entity.Warehouse;

public interface WarehouseService {

	Warehouse addWarehouse(WarehouseDto warehouseDto);

	List<Warehouse> fetchAllWarehouses();

	Warehouse fetchAllWarehousesById(long warehouseId);

}
