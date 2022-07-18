package com.tigerlogistics.main.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tigerlogistics.main.exception.EntityNotFoundException;
import com.tigerlogistics.main.exception.ParameterMisuseException;
import com.tigerlogistics.main.model.Model;
import com.tigerlogistics.main.repository.ReadOnlyRepository;

public abstract class BaseReadOnlyService<T extends Model<U>, U extends Serializable>
		implements SupplyChainReadOnlyService<T, U> {

	private ReadOnlyRepository<T, U> readOnlyRepository;

	public BaseReadOnlyService(ReadOnlyRepository<T, U> readOnlyRepository) {
		this.readOnlyRepository = readOnlyRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	@Override
	public T getById(U id) throws EntityNotFoundException, ParameterMisuseException {
		if (id == null)
			return null;
		return readOnlyRepository.getById(id);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	@Override
	public List<T> getAll() {
		return readOnlyRepository.getAll();
	}

}
