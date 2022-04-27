package com.tigerlogistics.rawmaterial.order.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RawMaterialOrder {
	@Id
	private Long RawMaterialOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	private Supplier supplier;
	private RawMaterial rawMaterial;
	

}
