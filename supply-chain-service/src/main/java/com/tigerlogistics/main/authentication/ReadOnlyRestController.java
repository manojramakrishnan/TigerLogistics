package com.tigerlogistics.main.authentication;

import java.io.Serializable;

import com.tigerlogistics.main.model.Model;
import com.tigerlogistics.main.service.SupplyChainReadOnlyService;

public class ReadOnlyRestController<T extends Model<U>, U extends Serializable> {
	
	private SupplyChainReadOnlyService<T, U> readOnlyService;

	public ReadOnlyRestController(SupplyChainReadOnlyService<T, U> readOnlyService) {
		this.readOnlyService = readOnlyService;
	}
}
