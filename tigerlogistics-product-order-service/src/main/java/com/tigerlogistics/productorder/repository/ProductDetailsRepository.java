package com.tigerlogistics.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tigerlogistics.productorder.entity.Product;
import com.tigerlogistics.productorder.entity.ProductOrder;

public interface ProductDetailsRepository extends JpaRepository<ProductOrder,Long>{


}
