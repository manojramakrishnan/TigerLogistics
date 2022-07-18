package com.tigerlogistics.main.category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(	name = "category_incoterm",
		uniqueConstraints = { @UniqueConstraint(columnNames = { "incoterm_code" }, name = "ux_incoterm_code") })

public class Incoterm extends BaseNamableModel{
private static final long serialVersionUID = 1L;
	
	private String incotermCode;
	
	
	public Incoterm() {
	}
	
	
	public Incoterm(String name) {
		super(name);
	}
	
	
	public Incoterm(Integer id, String name) {
		super(id, name);
	}
	
	
	@Column(name = "incoterm_code", length = 3, nullable = false)
	public String getIncotermCode() {
		return incotermCode;
	}
	
	
	public void setIncotermCode(String incotermCode) {
		this.incotermCode = incotermCode;
	}
	

}
