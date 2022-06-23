package com.tigerlogistics.supplier.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tigerlogistics.supplier.dto.DistributorDto;
import com.tigerlogistics.supplier.entity.Distributor;
import com.tigerlogistics.supplier.entity.Supplier;
import com.tigerlogistics.supplier.helper.DistributorDetailsMapper;
import com.tigerlogistics.supplier.repository.DistributorRepository;
import com.tigerlogistics.supplier.service.DistributorService;

@Service
public class DistributorServiceImpl implements DistributorService{

	@Autowired
	private DistributorRepository distributorRepository;

	
	@Override
	public Distributor addDistributor(Distributor distributor) {
		// TODO Auto-generated method stub
		return distributorRepository.save(distributor);
	}

	@Override
	public List<Distributor> fetchAllDistributor() {
		// TODO Auto-generated method stub
		return distributorRepository.findAll();
	}

	@Override
	public DistributorDto fetchDistributorById(long distributorId) {
		// TODO Auto-generated method stub
		return DistributorDetailsMapper.entityToDto(distributorRepository.findDistributorById(distributorId));
	}

	@Override
	public void updateDistributor(DistributorDto distributorDto) {
		// TODO Auto-generated method stub
		Distributor distributor=distributorRepository.findDistributorById(distributorDto.getDistributorId());
		distributor.setLocation(distributorDto.getLocation());
		distributor.setName(distributorDto.getName());
		distributor.setPhoneNo(distributorDto.getPhoneNo());
		distributorRepository.save(distributor);
		
	}

}
