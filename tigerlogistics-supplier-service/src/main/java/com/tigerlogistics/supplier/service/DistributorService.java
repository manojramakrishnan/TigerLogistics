package com.tigerlogistics.supplier.service;

import java.util.List;

import com.tigerlogistics.supplier.dto.DistributorDto;
import com.tigerlogistics.supplier.entity.Distributor;

public interface DistributorService {

	Distributor addDistributor(Distributor distributor);

	List<Distributor> fetchAllDistributor();

}
