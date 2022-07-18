package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "category_transportation_modes")
public class TransportationMode extends BaseNamableModel{
private static final long serialVersionUID = 1L;
	
	
	public TransportationMode() {
	}
	
	
	public TransportationMode(String name) {
		super(name);
	}
	
	
	public TransportationMode(Integer id, String name) {
		super(id, name);
	}

}
