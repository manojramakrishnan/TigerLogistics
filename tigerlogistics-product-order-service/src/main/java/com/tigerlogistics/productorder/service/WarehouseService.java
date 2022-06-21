package com.tigerlogistics.productorder.service;

import com.tigerlogistics.productorder.dto.WarehouseDto;
import com.tigerlogistics.productorder.entity.Warehouse;

public interface WarehouseService {

	Warehouse addWarehouse(WarehouseDto warehouseDto);

}
