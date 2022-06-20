package com.tigerlogistics.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.supplier.entity.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor,Long>{

}
