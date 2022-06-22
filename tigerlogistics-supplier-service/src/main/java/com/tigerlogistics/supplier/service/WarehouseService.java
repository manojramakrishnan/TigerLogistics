package com.tigerlogistics.supplier.service;

import com.tigerlogistics.supplier.dto.WarehouseDto;
import com.tigerlogistics.supplier.entity.Warehouse;

public interface WarehouseService {

	Warehouse addWarehouse(WarehouseDto warehouseDto);

}
