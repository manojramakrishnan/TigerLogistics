package com.tigerlogistics.rawmaterial.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.rawmaterial.order.entity.RawMaterialOrder;

@Repository
public interface RawMaterialOrderRepository extends JpaRepository<RawMaterialOrder,Long>{

	RawMaterialOrder findByRawMaterialOrderId(long rawMaterialOrderId);

}
