package com.tigerlogistics.rawmaterial.order.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tigerlogistics.rawmaterial.order.service.RawMaterialOrderService;
@RestController
@RequestMapping("")
public class RawMaterialOrderController {
	@Autowired
	private RawMaterialOrderService rawMaterialOrderService;
}
