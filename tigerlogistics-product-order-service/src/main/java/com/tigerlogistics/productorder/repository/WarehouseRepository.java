package com.tigerlogistics.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.productorder.dto.WarehouseDto;
import com.tigerlogistics.productorder.entity.Warehouse;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {

	

}
