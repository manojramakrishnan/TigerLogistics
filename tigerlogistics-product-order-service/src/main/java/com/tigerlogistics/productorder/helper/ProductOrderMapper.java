package com.tigerlogistics.productorder.helper;

import java.time.LocalDate;

import com.tigerlogistics.productorder.dto.ProductDetailsDTO;
import com.tigerlogistics.productorder.dto.ProductOrderRequest;
import com.tigerlogistics.productorder.dto.ProductOrderResponse;
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

	public static ProductDetailsDTO ToDto(ProductOrder product) {
		// TODO Auto-generated method stub
		
		return ProductDetailsDTO.builder().productOrderId(product.getProductOrderId()).quantity(product.getQuantity()).pricePerUnit(product.getPricePerUnit()).
				qualityCheck(product.getQualityCheck()).orderStatus(product.getOrderStatus()).deliveryDate(product.getDeliveryDate())
				.manufactureDate(product.getManufactureDate()).expiryDate(product.getExpiryDate()).orderedOn(product.getOrderedOn())
				.build();
		
	}
	public static ProductOrderResponse entityToDto(ProductOrder productOrder) {
		return ProductOrderResponse.builder()
			.productOrderId(productOrder.getProductOrderId())
			.productId(productOrder.getProduct().getProductId())
			.quantity(productOrder.getQuantity())
			.pricePerUnit(productOrder.getPricePerUnit())
			.qualityCheck(productOrder.getQualityCheck())
			.orderStatus(productOrder.getOrderStatus())
			.deliveryDate(productOrder.getDeliveryDate())
			.manufactureDate(productOrder.getManufactureDate())
			.expiryDate(productOrder.getExpiryDate())
			.orderedOn(productOrder.getOrderedOn())
			.distributorName(productOrder.getDistributor().getName())
			.distributorId(productOrder.getDistributor().getDistributorId())
			.productName(productOrder.getProduct().getMaterialName())
			.description(productOrder.getProduct().getDescription())
			.measurementUnit(productOrder.getProduct().getQuantityUnit())
			.warehouse(productOrder.getProduct().getWarehouse())
			.build();
	}


}
