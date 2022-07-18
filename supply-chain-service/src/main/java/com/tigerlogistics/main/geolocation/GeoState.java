package com.tigerlogistics.main.geolocation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tigerlogistics.main.model.BaseNamableModel;


@Entity
@Table(name = "geo_state", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "country_id", "conventional_abreviation" }, name = "ux_country_state") })
public class GeoState extends BaseNamableModel {
	private static final long serialVersionUID = 1L;

	private Country country;
	private String conventionalAbreviation;

	
	public GeoState() {
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "country_id", foreignKey = @ForeignKey(name = "FK_GEO_COUNTRY_GEO_STATE"), updatable = false, insertable = false)
	public Country getCountry() {
		return country;
	}

	
	public void setCountry(Country country) {
		this.country = country;
	}

	
	@Column(name = "conventional_abreviation", length = 8)
	public String getConventionalAbreviation() {
		return conventionalAbreviation;
	}

	
	public void setConventionalAbreviation(String conventionalAbreviation) {
		this.conventionalAbreviation = conventionalAbreviation;
	}

	
	@Override
	public String toString() {
		return "GeoState [country=" + country + ", conventionalAbreviation=" + conventionalAbreviation + "] "
				+ super.toString();
	}

}
