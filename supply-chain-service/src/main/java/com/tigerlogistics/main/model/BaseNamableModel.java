package com.tigerlogistics.main.model;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Required;


	@MappedSuperclass
	public abstract class BaseNamableModel extends BaseGenericModel {
		private static final long serialVersionUID = 1L;
		private String name;

		
		public BaseNamableModel() {
		}

		
		public BaseNamableModel(String name) {
			setName(name);
		}

		
		public BaseNamableModel(Integer id, String name) {
			setId(id);
			setName(name);
		}

		
		@Column(name = "name", unique = true, length = 150, nullable = false)
		@Required
		public String getName() {
			return name;
		}

		
		public void setName(String name) {
			this.name = name;
		}

		
		@Override
		public String toString() {
			return "BaseNamableModel [name=" + name + "]" + super.toString();
		}
	}


