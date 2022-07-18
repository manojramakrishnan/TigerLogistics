package com.tigerlogistics.main.category;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;

@Entity
@Table(name = "category_bundle_type")

public class BundleType extends BaseNamableModel{
private static final long serialVersionUID = 1L;
	
	
	public BundleType() {
	}
	
	
	public BundleType(String name) {
		super(name);
	}
	
	public BundleType(Integer id, String name) {
		super(id, name);
	}

}
