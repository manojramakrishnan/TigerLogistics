package com.tigerlogistics.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

	@Id
	@SequenceGenerator(name= "address_id_seqence", initialValue=100000, allocationSize=1)
	@GeneratedValue(generator= "address_id_seqence", strategy=GenerationType.SEQUENCE)
	private Long addressId;
	
	@Column(length=25)
	private String city;
	
	
	
}
