package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "category_assessment_method")

public class AssessmentMethod extends BaseNamableModel{
	
	private static final long serialVersionUID = 1L;
	
	
	public AssessmentMethod() {
	}
	
	
	public AssessmentMethod(String name) {
		super(name);
	}
	
	
	public AssessmentMethod(Integer id, String name) {
		super(id,name);
	}
	
}

