package com.tigerlogistics.productorder.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import javax.persistence.ForeignKey;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.tigerlogistics.productorder.enums.MeasurementUnit;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@SequenceGenerator(name="product_id_sequence",initialValue=10000,allocationSize=1)
	@GeneratedValue(generator="product_id_sequence",strategy=GenerationType.SEQUENCE)
	private Long productId;
	private String materialName;
	private String description;
	private Double quantityAvailable;
	@Enumerated(EnumType.STRING)
	private MeasurementUnit quantityUnit;
	@ManyToOne
  	@JoinColumn(name = "warehouseId", referencedColumnName = "warehouseId", foreignKey = @ForeignKey(name = "FK_prod_warehouse_ID"))
	private Warehouse warehouse;
	
}
