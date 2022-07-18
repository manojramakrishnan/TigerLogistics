package com.tigerlogistics.main.geolocation;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.tigerlogistics.main.model.BaseGenericModel;




@MappedSuperclass
public class Address extends BaseGenericModel {
	private static final long serialVersionUID = 1L;
	private String streetAddress;
	private String additionalAddressInfo;
	private String city;
	private GeoState geoState;
	private String zip;
	private String landLine;
	private String contactName;
	private String addressType;

	
	public Address() {
	}

	
	@Column(length = 150)
	public String getStreetAddress() {
		return streetAddress;
	}

	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	
	@Column(length = 150)
	public String getAdditionalAddressInfo() {
		return additionalAddressInfo;
	}

	
	public void setAdditionalAddressInfo(String additionalAddressInfo) {
		this.additionalAddressInfo = additionalAddressInfo;
	}

	
	@Column(length = 80)
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "geo_state_id", foreignKey = @ForeignKey(name = "FK_GEO_STATE_GEO_ADDRESS"))
	public GeoState getGeoState() {
		return geoState;
	}

	
	public void setGeoState(GeoState geoState) {
		this.geoState = geoState;
	}

	
	@Column(length = 80)
	public String getZip() {
		return zip;
	}

	
	public void setZip(String zip) {
		this.zip = zip;
	}

	
	@Column(length = 20)
	public String getLandLine() {
		return landLine;
	}

	
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	
	@Column(length = 80)
	public String getContactName() {
		return contactName;
	}

	
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	
	@Column(length = 20)
	public String getAddressType() {
		return addressType;
	}

	
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", additionalAddressInfo=" + additionalAddressInfo
				+ ", city=" + city + ", geoState=" + geoState + ", zip=" + zip + ", landLine=" + landLine
				+ ", contactName=" + contactName + ", addressType=" + addressType + "]";
	}

}