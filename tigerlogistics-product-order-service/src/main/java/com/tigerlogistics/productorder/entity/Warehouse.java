package com.tigerlogistics.productorder.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Warehouse {

	@Id
	@SequenceGenerator(name="warehouse_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="warehouse_id_sequence",strategy=GenerationType.SEQUENCE)
	private Long warehouseId;
	private String name;
	private String description;
}