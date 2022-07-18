package com.tigerlogistics.main.service;

import java.io.Serializable;
import java.util.List;

import com.tigerlogistics.main.model.EditValidation;
import com.tigerlogistics.main.model.Model;

public interface SupplyChainService<T extends  Model<U>, U extends Serializable>  extends SupplyChainReadOnlyService<T,U>{
	
	List<EditValidation> add(T entity);

	List<EditValidation> update(T entity);
	
	List<EditValidation> delete (U id);
	
	default List<EditValidation> validate(T entity){
		return null;
	}
}
