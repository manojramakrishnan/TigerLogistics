package com.tigerlogistics.supplier.helper;

import com.tigerlogistics.supplier.dto.DistributorDto;
import com.tigerlogistics.supplier.entity.Distributor;

public class DistributorDetailsMapper {

	public static DistributorDto entityToDto(Distributor distributor) {
		// TODO Auto-generated method stub
		return DistributorDto.builder()
		.distributorId(distributor.getDistributorId())
		.name(distributor.getName())
		.location(distributor.getLocation())
		.phoneNo(distributor.getPhoneNo())
		.build();
	}

	

}
