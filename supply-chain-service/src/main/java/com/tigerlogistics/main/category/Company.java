package com.tigerlogistics.main.category;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tigerlogistics.main.geolocation.Address;
import com.tigerlogistics.main.model.BaseNamableModel;




@Entity
@Table(name = "category_company")
public class Company extends BaseNamableModel{
	private static final long serialVersionUID = 1L;
	private String roles;
	private String taxId;
	private String email;
	private List<Address> addresses=new ArrayList<>();

	
	public Company() {
	}

	
	public Company(String name) {
		super(name);
	}

	

	
	@Column(length = 30)
	public String getTaxId() {
		return taxId;
	}

	
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	
	@Column(length = 150)
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	@Column(length = 80)
	public String getRoles() {
		return roles;
	}

	
	public void setRoles(String roles) {
		this.roles = roles;
	}

	
	@Override
	public String toString() {
		return "Company [roles=" + roles + ", taxId=" + taxId + ", email=" + email + "]";
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "company", orphanRemoval = true, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REMOVE })
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


}
