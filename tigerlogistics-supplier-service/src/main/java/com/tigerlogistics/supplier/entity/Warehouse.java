package com.tigerlogistics.supplier.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Warehouse {
	@Id
	@SequenceGenerator(name="warehouse_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="warehouse_id_sequence",strategy=GenerationType.SEQUENCE)
	private Long warehouseId;
	@Column(length = 20)
	private String name;
	@Column(length = 30)
	private String description;

}
