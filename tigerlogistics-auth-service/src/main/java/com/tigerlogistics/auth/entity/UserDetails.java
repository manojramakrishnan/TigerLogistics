package com.tigerlogistics.auth.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	@Id
	private Long userDetailsId;
	private String firstName;
	private String lastName;
	private String designation;
	private String gender;
	private LocalDate dob;
	private String emailId;
	private String phoneNo;
	private String securityQuestion;
	private String securityAnswer;
	@OneToOne
	@JoinColumn(name="addressId",referencedColumnName="addressId",foreignKey=@ForeignKey(name="FK_ADDR_ID"))
	private Address address;

	@OneToOne
	@JoinColumn(name="userDetailsId",referencedColumnName="userId",foreignKey=@ForeignKey(name="FK_USER_ID"))
	@MapsId
	private User user;

public UserDetails() {
	
}

public UserDetails(Long userDetailsId, String firstName, String lastName, String designation, String gender,
		LocalDate dob, String emailId, String phoneNo, String securityQuestion, String securityAnswer, Address address,
		User user) {
	super();
	this.userDetailsId = userDetailsId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.designation = designation;
	this.gender = gender;
	this.dob = dob;
	this.emailId = emailId;
	this.phoneNo = phoneNo;
	this.securityQuestion = securityQuestion;
	this.securityAnswer = securityAnswer;
	this.address = address;
	this.user = user;
}

@Override
public String toString() {
	return "UserDetails [userDetailsId=" + userDetailsId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", designation=" + designation + ", gender=" + gender + ", dob=" + dob + ", emailId=" + emailId
			+ ", phoneNo=" + phoneNo + ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer
			+ ", address=" + address + ", user=" + user + "]";
}

public Long getUserDetailsId() {
	return userDetailsId;
}

public void setUserDetailsId(Long userDetailsId) {
	this.userDetailsId = userDetailsId;
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

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
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

public String getSecurityQuestion() {
	return securityQuestion;
}

public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}

public String getSecurityAnswer() {
	return securityAnswer;
}

public void setSecurityAnswer(String securityAnswer) {
	this.securityAnswer = securityAnswer;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
	
 	

}
