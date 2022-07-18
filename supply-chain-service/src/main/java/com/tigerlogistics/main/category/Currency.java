package com.tigerlogistics.main.category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(	name = "category_currency",
		uniqueConstraints = { @UniqueConstraint(columnNames = { "currency_code" }, name = "ux_currency_code") })
public class Currency extends BaseNamableModel{
private static final long serialVersionUID = 1L;
	
	private String currencyCode;
	
	
	public Currency() {
	}
	
	
	public Currency(String name) {
		super(name);
	}
	
	
	public Currency(Integer id, String name) {
		super(id, name);
	}
	
	
	@Column(name = "currency_code", length = 3, nullable = false)
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
