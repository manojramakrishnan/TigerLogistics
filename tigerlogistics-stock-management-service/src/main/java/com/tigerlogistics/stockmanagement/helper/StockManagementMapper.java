package com.tigerlogistics.stockmanagement.helper;

import java.time.LocalDate;

import com.tigerlogistics.stockmanagement.dto.ProductAddRequest;
import com.tigerlogistics.stockmanagement.entity.Product;
import com.tigerlogistics.stockmanagement.entity.ProductOrder;
import com.tigerlogistics.stockmanagement.enums.QualityCheck;


public class StockManagementMapper {

	public static ProductOrder DtoToEntity(ProductAddRequest productAddRquest) {
		// TODO Auto-generated method stub
		ProductOrder order = new ProductOrder();
		Product product = new Product();
		product.setProductId(productAddRquest.getProductId());
		order.setProduct(product);
		order.setQuantity(productAddRquest.getQuantity());
		order.setPricePerUnit(productAddRquest.getPricePerUnit());
		order.setQualityCheck(QualityCheck.valueOf(productAddRquest.getQualityCheck()));
		order.setDeliveryDate(productAddRquest.getDeliveryDate());
		order.setExpiryDate(productAddRquest.getExpiryDate());
		order.setManufactureDate(productAddRquest.getManufactureDate());
		order.setOrderedOn(LocalDate.now());
		return order;
	}

}
