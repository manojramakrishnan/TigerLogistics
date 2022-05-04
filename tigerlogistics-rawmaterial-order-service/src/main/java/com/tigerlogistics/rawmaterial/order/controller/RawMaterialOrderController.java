package com.tigerlogistics.rawmaterial.order.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderDto;
import com.tigerlogistics.rawmaterial.order.dto.RawMaterialOrderRequest;
import com.tigerlogistics.rawmaterial.order.service.RawMaterialOrderService;
@RestController
@RequestMapping("/rawMaterialOrder")
@CrossOrigin(origins="*")
public class RawMaterialOrderController {
	@Autowired
	private RawMaterialOrderService rawMaterialOrderService;
	@PostMapping
	public ResponseEntity<Map<String,String>> createOrder(@RequestBody RawMaterialOrderRequest rawMaterialOrderRequest){
		return ResponseEntity.status(HttpStatus.OK).body(rawMaterialOrderService.createOrder(rawMaterialOrderRequest));
		
	}
	@GetMapping("/fetchAllOrders")
	public ResponseEntity<List<RawMaterialOrderDto>> fetchAllOrders(){
		return ResponseEntity.status(HttpStatus.OK).body(rawMaterialOrderService.fetchAllOrders());	}
}