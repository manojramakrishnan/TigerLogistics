package com.tigerlogistics.supplier.entity;

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
public class Supplier {
	@Id
	@SequenceGenerator(name = "supplier_id_sequence", initialValue = 100000, allocationSize = 1)
	@GeneratedValue(generator = "supplier_id_sequence", strategy = GenerationType.SEQUENCE)
	private Long supplierId;
	private String name;
	private String location;
	private String phoneNo;
	
}
