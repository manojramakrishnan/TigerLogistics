package com.tigerlogistics.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tigerlogistics.productorder.entity.Product;

public interface ProductDetailsRepository extends JpaRepository<Product,Long>{


}
