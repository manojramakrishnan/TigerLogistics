package com.tigerlogistics.productorder.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigerlogistics.productorder.dto.UpdateStockRequest;
import com.tigerlogistics.productorder.entity.Product;
import com.tigerlogistics.productorder.service.UpdateStockService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UpdateStockServiceImpl implements UpdateStockService {

	private RestTemplate restTemplate;

	@Override
	public boolean updateProductStock(Long productId, Double quantity) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/jason");
		headers.add("Accept", "*/*");
		ObjectMapper mapper = new ObjectMapper();
		String requestBody;
		try {
			requestBody = mapper.writeValueAsString(new UpdateStockRequest(productId, quantity));

			HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers);
			return restTemplate.exchange("http://tigerlogistics-stock-management-service/productstock", HttpMethod.PUT,
					entity, Product.class).getStatusCode().is2xxSuccessful();
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
