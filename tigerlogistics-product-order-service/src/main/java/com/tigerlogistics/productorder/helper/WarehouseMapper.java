package com.tigerlogistics.productorder.helper;

import com.tigerlogistics.productorder.dto.WarehouseDto;
import com.tigerlogistics.productorder.entity.Warehouse;

public class WarehouseMapper {
	public static Warehouse addToWarehouse(WarehouseDto warehouseDto)
	{
		Warehouse warehouse=new Warehouse();
		warehouse.getWarehouseId();
		warehouse.getName();
		warehouse.getDescription();
		return warehouse;
		
	}
	public static Warehouse warehouseDtoToEntity(WarehouseDto warehouseDto) {
		return Warehouse.builder().warehouseId(warehouseDto.getWarehouseId()).name(warehouseDto.getName()).description(warehouseDto.getDescription()).build();
		
	}
}
