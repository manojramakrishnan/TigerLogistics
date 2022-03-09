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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Distributor {

  @Id
  @SequenceGenerator(name = "distributor_id_sequence", initialValue = 100000, allocationSize = 1)
  @GeneratedValue(generator = "distributor_id_sequence", strategy = GenerationType.SEQUENCE)
  private Long distributorId;
  @Column(length = 20)
  private String name;
  @Column(length = 30)
  private String location;
  @Column(length = 10)
  private String phoneNo;

}
