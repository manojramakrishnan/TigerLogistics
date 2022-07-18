package com.tigerlogistics.main.repository;

import java.io.Serializable;
import java.util.List;

import com.tigerlogistics.main.model.Model;

public interface ReadOnlyRepository <T extends Model<U>, U extends Serializable>{
	
	T getById(U id);
	
	List<T> getAll();

}
