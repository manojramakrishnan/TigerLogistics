package com.tigerlogistics.rawmaterial.order.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.tigerlogistics.rawmaterial.order.enums.MeasurementUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RawMaterial {
	@Id
	@SequenceGenerator(name = "rawmaterial_id_sequence", initialValue = 100000, allocationSize = 1)
	@GeneratedValue(generator = "rawmaterial_id_sequence", strategy = GenerationType.SEQUENCE)
	private Long rawMaterialId;
	private String materialName;
	private String description;
	private Double quantityAvailabe;
	@Enumerated(EnumType.STRING)
	private MeasurementUnit quantityUnit;
	@ManyToOne
	@JoinColumn(name = "warehouseId", referencedColumnName = "warehouseId", foreignKey = @ForeignKey(name = "FK_raw_matr_warehouse_ID"))
	private Warehouse warehouse;

}
