package com.tigerlogistics.main.category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tigerlogistics.main.geolocation.Country;
import com.tigerlogistics.main.model.BaseGenericModel;


@Entity
@Table(name = "category_tariff", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "tariff_code", "country_id" }, name = "ux_country_tariff") })
public class Tariff extends BaseGenericModel{
	private static final long	serialVersionUID	= 1L;
	private String				tariffCode;
	private String				tariffDescription;
	private Country				country;
	
	
	@Column(name="tariff_code", length = 20)
	public String getTariffCode() {
		return tariffCode;
	}
	
	
	public void setTariffCode(String tariffCode) {
		this.tariffCode = tariffCode;
	}
	
	
	@Column(name="tariff_description", length = 250)
	public String getTariffDescription() {
		return tariffDescription;
	}
	
	
	public void setTariffDescription(String tariffDescription) {
		this.tariffDescription = tariffDescription;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "country_id")
	public Country getCountry() {
		return country;
	}
	
	
	public void setCountry(Country country) {
		this.country = country;
	}

}
