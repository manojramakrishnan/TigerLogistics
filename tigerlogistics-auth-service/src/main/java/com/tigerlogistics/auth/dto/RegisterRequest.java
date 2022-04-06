package com.tigerlogistics.auth.dto;

import java.time.LocalDate;

import com.tigerlogistics.auth.entity.Address;




public class RegisterRequest {
	@Override
	public String toString() {
		return "RegisterRequest [username=" + username + ", password=" + password + ", designation=" + designation
				+ ", gender=" + gender + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", dob=" + dob + ", address="
				+ address + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	private String username;
	private String password;
	private String designation;
	private String gender;
	private String emailId;
	private String phoneNo;
	private LocalDate dob;
	private Address address;
	private String firstName;
	public RegisterRequest() {
		
	}
	public RegisterRequest(String username, String password, String designation, String gender, String emailId,
			String phoneNo, LocalDate dob, Address address, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.designation = designation;
		this.gender = gender;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName;
	

}
