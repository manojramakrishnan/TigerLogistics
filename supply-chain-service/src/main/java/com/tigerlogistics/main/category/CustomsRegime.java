package com.tigerlogistics.main.category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "cat_customs_regime", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "customs_regime_code" }, name = "ux_customs_regime_code") })
public class CustomsRegime extends BaseNamableModel {
	private static final long	serialVersionUID	= 1L;
	private String				customsRegimeCode;
	
	
	public CustomsRegime() {
	}
	
	public CustomsRegime(String name) {
		super(name);
	}
	
	
	public CustomsRegime(Integer id, String name) {
		super(id, name);
	}
	
	
	@Column(name = "customs_regime_code", length = 2, nullable = false)
	public String getCustomsRegimeCode() {
		return customsRegimeCode;
	}
	
	
	public void setCustomsRegimeCode(String customsRegimeCode) {
		this.customsRegimeCode = customsRegimeCode;
	}

}
