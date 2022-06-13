package com.tigerlogistics.rawmaterial.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tigerlogistics.rawmaterial.order.entity.RawMaterial;

public interface RawMaterialRepository extends JpaRepository<RawMaterial,Long>{

	RawMaterial findRawMaterialById(long rawMaterialId);

}
