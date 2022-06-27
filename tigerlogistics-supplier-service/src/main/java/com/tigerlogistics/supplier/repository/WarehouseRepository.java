package com.tigerlogistics.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.supplier.entity.Warehouse;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {

	Warehouse findByWarehouseId(Long warehouseId);

	

}
