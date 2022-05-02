package com.tigerlogistics.productorder.helper;

import java.time.LocalDate;

import com.tigerlogistics.productorder.dto.ProductDetailsDTO;
import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.entity.Distributor;
import com.tigerlogistics.productorder.enums.OrderStatus;
import com.tigerlogistics.productorder.entity.Product;
import com.tigerlogistics.productorder.entity.ProductOrder;
import com.tigerlogistics.productorder.enums.QualityCheck;

public class ProductOrderMapper {

	public static ProductOrder DtoToEntity(ProductOrderRequest request) {
		ProductOrder order = new ProductOrder();
		Distributor distributor = new Distributor();
		distributor.setDistributorId(request.getDistributorId());
		Product product = new Product();
		product.setProductId(request.getProductId());
		order.setProduct(product);
		order.setQuantity(request.getQuantity());
		order.setPricePerUnit(request.getPricePerUnit());
		order.setQualityCheck(QualityCheck.valueOf(request.getQualityCheck()));
		order.setDeliveryDate(request.getDeliveryDate());
		order.setExpiryDate(request.getExpiryDate());
		order.setManufactureDate(request.getManufactureDate());
		order.setOrderStatus(OrderStatus.Processing);
		order.setDistributor(distributor);
		order.setOrderedOn(LocalDate.now());
		return order;
	}

	public static ProductDetailsDTO productDetailsToDto(Product product) {
		// TODO Auto-generated method stub
		
		return ProductDetailsDTO.builder().productId(product.getProductId()).materialName(product.getMaterialName()).description(product.getDescription()).
				quantityAvailable(product.getQuantityAvailable()).quantityUnit(product.getQuantityUnit()).warehouse(product.getWarehouse()).build();
		
	}
}
