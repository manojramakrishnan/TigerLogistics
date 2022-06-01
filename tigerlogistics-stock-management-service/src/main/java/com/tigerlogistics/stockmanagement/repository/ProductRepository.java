package com.tigerlogistics.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.stockmanagement.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	@Query("SELECT p FROM Product p where p.id = :productId")
	Product findProductById(long productId);
}
