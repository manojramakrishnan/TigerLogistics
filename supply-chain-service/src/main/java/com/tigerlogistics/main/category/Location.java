package com.tigerlogistics.main.category;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tigerlogistics.main.model.BaseNamableModel;



@Entity
@Table(name = "category_location")
public class Location extends BaseNamableModel {
	private static final long	serialVersionUID	= 1L;
	private Storage				storage;
	
	
	public Location() {
	}
	
	
	public Location(String name) {
		super(name);
	}
	
	
	public Location(Integer id, String name) {
		super(id, name);
	}
	
	
	public Location(Integer id, String name, Storage storage) {
		this(id, name);
		this.storage = storage;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "storage_id")
	public Storage getStorage() {
		return storage;
	}
	
	
	public void setStorage(Storage storage) {
		this.storage = storage;
	}

}
