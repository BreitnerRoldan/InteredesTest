package com.pruebaSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaSpring.entity.Orders;
import com.pruebaSpring.model.OrdersModel;
import com.pruebaSpring.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<OrdersModel>> listAll() {

		List<Orders> list = orderService.findAll();
		List<OrdersModel> lista = new ArrayList<OrdersModel>();

		for (Orders c : list) {
			lista.add(new OrdersModel(c.getOrderId(), c.getCustomerId(), c.getOrderDate(), c.getOrderLocalization()));
		}
		return new ResponseEntity<List<OrdersModel>>(lista, HttpStatus.OK);

		}
	
	@PostMapping
	public ResponseEntity<OrdersModel> RecordOrders(@RequestBody OrdersModel model) throws Exception{
		Orders o = new Orders();
		o.setCustomerId(model.getCustomerId());
		o.setOrderDate(model.getOrderDate());
		o.setOrderLocalization(model.getOrderLocalization());
		
		o = orderService.Record(o); 

		return new ResponseEntity<OrdersModel>(new OrdersModel(o.getOrderId(), o.getCustomerId(), o.getOrderDate(), o.getOrderLocalization()),
				HttpStatus.CREATED);
	}
	
	}
