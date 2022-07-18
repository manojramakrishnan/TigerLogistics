package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name="category_un_labels")
public class UnLabel extends BaseNamableModel {
private static final long serialVersionUID = 1L;
	
	
	public UnLabel() {
	}
	
	
	public UnLabel(String name) {
		super(name);
	}
	
	
	public UnLabel(Integer id, String name) {
		super(id, name);
	}

}
