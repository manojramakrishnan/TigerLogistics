package com.tigerlogistics.main.service;

import java.io.Serializable;

import com.tigerlogistics.main.model.Model;
import com.tigerlogistics.main.repository.Repository;


public abstract class BaseService <T extends Model<U>, U extends Serializable> extends BaseReadOnlyService<T, U> implements SupplyChainService<T,U>{

	private Repository<T,U> repository;
	
	public BaseService(Repository<T,U> repository) {
		super(repository);
		this.repository = repository;
	}
}
