package com.tigerlogistics.productorder.entity;



import java.time.LocalDate;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tigerlogistics.productorder.enums.MeasurementUnit;
import com.tigerlogistics.productorder.enums.OrderStatus;
import com.tigerlogistics.productorder.enums.QualityCheck;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductOrder {
	
	@Id
	@SequenceGenerator(name="product_order_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="product_order_id_sequence",strategy=GenerationType.SEQUENCE)
	private Long productOrderId;
	private Double quantity;
	private Double pricePerUnit;
	@Enumerated(EnumType.STRING)
	private QualityCheck qualityCheck;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	private LocalDate orderedOn;
	@Enumerated(EnumType.STRING)
	private MeasurementUnit measurementUnit;
	@ManyToOne
  	@JoinColumn(name = "distributorId", referencedColumnName = "distributorId", foreignKey = @ForeignKey(name = "FK_product_distributor_ID"))
	private Distributor distributor;
	@ManyToOne
  	@JoinColumn(name = "productId", referencedColumnName = "productId", foreignKey = @ForeignKey(name = "FK_product_order_ID"))
	private Product product;

}
