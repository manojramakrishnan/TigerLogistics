package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "category_traffic_types")
public class TrafficType extends BaseNamableModel {
private static final long serialVersionUID = 1L;
	
	
	public TrafficType() {
	}
	
	
	public TrafficType(String name) {
		super(name);
	}
	
	
	public TrafficType(Integer id, String name) {
		super(id, name);
	}

}
