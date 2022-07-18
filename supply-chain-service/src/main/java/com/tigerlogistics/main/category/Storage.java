package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tigerlogistics.main.exception.ParameterMisuseException;
import com.tigerlogistics.main.model.BaseNamableModel;

@Entity
@Table(name = "category_storage")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Storage extends BaseNamableModel{
	private static final long	serialVersionUID	= 1L;
	private Company				company;
	
	
	public Storage() {
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "company_id")
	public Company getCompany() {
		return company;
	}
	
	
	public void setCompany(Company company) throws ParameterMisuseException {
		if (company != null) {
			boolean isReceiver = company.getRoles().contains("receiver");
			if (!isReceiver) throw new ParameterMisuseException("Company must be receiver to assign storages in it.");
		}
		this.company = company;
	}

}
