package com.tigerlogistics.productorder.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductOrder {
	
	@Id
	@SequenceGenerator(name="product_order_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="product_order_id_sequence",strategy=SEQUENCE)
	private Long productOrderId;
	private Double quantity;
	private Double pricePerUnit;
	private QualityCheck qualityCheck;
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	private Distributor distributor;
	private Product product;

}
