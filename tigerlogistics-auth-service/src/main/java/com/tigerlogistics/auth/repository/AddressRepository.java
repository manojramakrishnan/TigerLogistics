package com.tigerlogistics.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.auth.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
	

}
