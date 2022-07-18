package com.tigerlogistics.main.service;

import java.io.Serializable;
import java.util.List;

import com.tigerlogistics.main.exception.EntityNotFoundException;
import com.tigerlogistics.main.exception.ParameterMisuseException;
import com.tigerlogistics.main.model.Model;

public interface SupplyChainReadOnlyService <T extends Model<U>,U extends Serializable>{

	T getById(U id) throws EntityNotFoundException, ParameterMisuseException;
	
	List<T> getAll();

}
