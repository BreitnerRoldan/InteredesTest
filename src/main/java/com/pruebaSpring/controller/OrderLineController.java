package com.pruebaSpring.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pruebaSpring.entity.OrderLine;

import com.pruebaSpring.model.OrderlineModel;

import com.pruebaSpring.service.OrderLineService;

@RestController
@RequestMapping("/api/v1/orderline")
public class OrderLineController {
	
	@Autowired
	private OrderLineService orderLineService;

	@PostMapping
	public ResponseEntity<OrderlineModel> RecordCustomer(@RequestBody OrderlineModel model) throws Exception {
		OrderLine or = new OrderLine();
		or.setOrderId(model.getOrderId());
		or.setProductId(model.getProductId());
		or.setQuantity(model.getQuantity());

		or = orderLineService.Record(or);

		return new ResponseEntity<OrderlineModel>(new OrderlineModel(),
				HttpStatus.CREATED);
}
}
