package com.tigerlogistics.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.stockmanagement.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
