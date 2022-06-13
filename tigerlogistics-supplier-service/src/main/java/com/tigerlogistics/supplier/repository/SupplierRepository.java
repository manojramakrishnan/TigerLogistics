package com.tigerlogistics.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.supplier.entity.Supplier;



//
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long>{
	Supplier findBySupplierId(Long supplierId);
	
}