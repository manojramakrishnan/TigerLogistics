package com.tigerlogistics.main.category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "cat_units")
public class Unit extends BaseNamableModel{
	private static final long	serialVersionUID	= 1L;
	private UnitType			unitType;
	
	
	public Unit() {
	}
	
	
	public Unit(String name) {
		super(name);
		this.unitType = UnitType.UNKNOWN;
	}
	
	
	public Unit(Integer id, String name) {
		super(id, name);
		this.unitType = UnitType.UNKNOWN;
	}
	
	
	@Column(length = 15)
	public String getUnitType() {
		return unitType == null ? UnitType.UNKNOWN.name() : unitType.name();
	}
	
	
	public void setUnitType(String unitType) {
		if (unitType == null) {
			this.unitType = UnitType.UNKNOWN;
			return;
		}
		try {
			this.unitType = UnitType.valueOf(unitType.toUpperCase());
		} catch (Exception e) {
			this.unitType = UnitType.UNKNOWN;
		}
	}
	
	
	public static enum UnitType {
		UNKNOWN, WEIGHT, LENGTH, VOLUME, PACKING
	}

}
