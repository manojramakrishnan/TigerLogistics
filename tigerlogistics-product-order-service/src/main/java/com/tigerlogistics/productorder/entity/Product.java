package com.tigerlogistics.productorder.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

	@Id
	@SequenceGenerator(name="product_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="product_id_sequence",strategy=SEQUENCE)
	private Long productId;
	private String materialName;
	private String description;
	private Double quatityAvailable;
	private MeasurementUnit quantityUnit;
	private Warehouse warehouse;
	
}
