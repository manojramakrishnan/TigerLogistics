package com.tigerlogistics.productorder.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Distributor {

	@Id
	@SequenceGenerator(name="distributor_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="distributor_id_sequence",strategy=SEQUENCE)
	private Long distributorId;
	private String name;
	private String location;
	private String phoneNo;
}
