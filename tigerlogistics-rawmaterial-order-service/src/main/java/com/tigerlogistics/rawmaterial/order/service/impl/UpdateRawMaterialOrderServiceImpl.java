package com.tigerlogistics.rawmaterial.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigerlogistics.rawmaterial.order.dto.UpdateStockRequest;
import com.tigerlogistics.rawmaterial.order.entity.RawMaterial;
import com.tigerlogistics.rawmaterial.order.service.UpdateRawMaterialOrderService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UpdateRawMaterialOrderServiceImpl implements UpdateRawMaterialOrderService {

//private RestTemplate restTemplate;
	@Override
	public boolean updateRawMaterialStock(Long rawMaterialOrderId, Double quantity) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "application/jason");
//		headers.add("Accept", "*/*");
//	ObjectMapper mapper = new ObjectMapper();
//	String requestBody;
//		try {
//			requestBody = mapper.writeValueAsString(new UpdateStockRequest(rawMaterialOrderId, quantity));
//			HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers);
//
//			return restTemplate.exchange("http://tigerlogistics-stock-management-service/productstock", HttpMethod.PUT,
//					entity, RawMaterial.class).getStatusCode().is2xxSuccessful();
//		} catch (JsonProcessingException e) {
//			System.out.println(e.getMessage());
//		}
		return false;

	}

}
