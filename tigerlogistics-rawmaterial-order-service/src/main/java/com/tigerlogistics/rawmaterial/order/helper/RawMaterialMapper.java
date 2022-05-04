package com.tigerlogistics.rawmaterial.order.helper;

import java.time.LocalDate;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderDto;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest.RawMaterialOrderRequestBuilder;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterial;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterialOrder;
import com.tigerlogistics.rawmaterial.order.entity.Supplier;
import com.tigerlogistics.rawmaterial.order.enums.OrderStatus;
import com.tigerlogistics.rawmaterial.order.enums.QualityCheck;

public class RawMaterialMapper {
	public static RawMaterialOrder DtoToEntity(RawMaterialOrderRequest request) {
	    RawMaterialOrder order = new RawMaterialOrder();
	    Supplier supplier = new Supplier();
	    supplier.setSupplierId(request.getSupplierId());
	    RawMaterial rawMaterial = new RawMaterial();
	    rawMaterial.setRawMaterialId(request.getRawMaterialId());
	    order.setDeliveryDate(request.getDeliveryDate());
	    order.setExpiryDate(request.getExpiryDate());
	    order.setOrderStatus(OrderStatus.Processing);
	    order.setSupplier(supplier);
	    order.setPricePerUnit(request.getPricePerUnit());
	    order.setQuantity(request.getQuantity());
	    order.setOrderedOn(LocalDate.now());
	    order.setQualityCheck(QualityCheck.valueOf(request.getQualityCheck()));
	    order.setRawMaterial(rawMaterial);
	    return order;
	  }
	public static RawMaterialOrderDto orderDetailstoDto(RawMaterialOrder rawMaterialOrder) {
		return RawMaterialOrderDto.builder().rawMaterialOrderId(rawMaterialOrder.getRawMaterialOrderId()).quantity(rawMaterialOrder.getQuantity())
				.pricePerUnit(rawMaterialOrder.getPricePerUnit()).qualityCheck(rawMaterialOrder.getQualityCheck()).orderStatus(rawMaterialOrder.getOrderStatus())
				.deliveryDate(rawMaterialOrder.getDeliveryDate()).expiryDate(rawMaterialOrder.getExpiryDate()).orderedOn(rawMaterialOrder.getOrderedOn()).supplier(rawMaterialOrder.getSupplier()).rawMaterial(rawMaterialOrder.getRawMaterial()).build();
		
	}
}