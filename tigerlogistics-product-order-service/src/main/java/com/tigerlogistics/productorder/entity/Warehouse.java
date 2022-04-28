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
public class Warehouse {

	@Id
	@SequenceGenerator(name="warehouse_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="warehouse_id_sequence",strategy=SEQUENCE)
	private Long warehouseId;
	private String name;
	private String description;
}
