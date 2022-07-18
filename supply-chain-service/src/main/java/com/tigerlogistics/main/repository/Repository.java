package com.tigerlogistics.main.repository;

import java.io.Serializable;

import com.tigerlogistics.main.model.Model;

public interface Repository<T extends Model<U>, U extends Serializable> extends ReadOnlyRepository<T, U> {
	
	void add(T entity);
	
	void update(T entity);
	
	void delete(T entity);
}
