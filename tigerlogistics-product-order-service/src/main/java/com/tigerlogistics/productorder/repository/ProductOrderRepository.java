package com.tigerlogistics.productorder.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tigerlogistics.productorder.entity.ProductOrder;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder,Long> {

	@Query("SELECT p FROM ProductOrder p where p.id = :productOrderId")
	ProductOrder findProductById(long productOrderId);

	ProductOrder findByProductOrderId(Long orderId);


}
