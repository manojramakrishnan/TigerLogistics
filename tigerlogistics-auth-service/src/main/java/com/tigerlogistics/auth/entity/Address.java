package com.tigerlogistics.auth.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Address {
	@Id
	@SequenceGenerator(name="address_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="address_id_sequence",strategy=SEQUENCE)
	private Long AddressId;
	private String city;
	private String state;
	private String area;
	private String pincode;
	public Address() {
		
	}
	public Address(Long addressId, String city, String state, String area, String pincode) {
		super();
		AddressId = addressId;
		this.city = city;
		this.state = state;
		this.area = area;
		this.pincode = pincode;
	}
	public Long getAddressId() {
		return AddressId;
	}
	public void setAddressId(Long addressId) {
		AddressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
