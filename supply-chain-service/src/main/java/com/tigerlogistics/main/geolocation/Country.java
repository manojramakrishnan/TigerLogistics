package com.tigerlogistics.main.geolocation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tigerlogistics.main.model.BaseNamableModel;

@Entity
@Table(	name = "geo_country",
		uniqueConstraints = { @UniqueConstraint(columnNames = { "country_code" }, name = "ux_country_code") })
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Country extends BaseNamableModel {
	private static final long	serialVersionUID	= 1L;
	private String					countryCode;
	private Set<GeoState> 	states = new HashSet<>();

	
	public Country() {	}

	
	public Country(String name) {
		super(name);
	}

	
	public Country(Integer id, String name) {
		super(id, name);
	}

	
	@Column(name = "country_code", length = 3, nullable = false)
	public String getCountryCode() {
		return countryCode;
	}

	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	
	@JsonIgnore
	@OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
	public Set<GeoState> getStates() {
		return this.states;
	}

	
	public void setStates(Set<GeoState> states) {
		this.states = states;
	}

}
