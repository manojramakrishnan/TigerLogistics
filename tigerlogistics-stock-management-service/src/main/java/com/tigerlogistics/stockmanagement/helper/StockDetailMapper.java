package com.tigerlogistics.stockmanagement.helper;

import com.tigerlogistics.stockmanagement.dto.ProductDto;
import com.tigerlogistics.stockmanagement.entity.Product;

public class StockDetailMapper {

	public static ProductDto entityToDto(Product product) {
		return ProductDto.builder()
			.productId(product.getProductId())
			.quantityAvailable(product.getQuantityAvailable())
			.quantityUnit(product.getQuantityUnit())
			.materialName(product.getMaterialName())
			.warehouse(product.getWarehouse())
			.description(product.getDescription())
			.build();
	}


}
