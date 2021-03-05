package com.pruebaSpring.service;

import java.util.List;

import com.pruebaSpring.entity.Orders;

public interface OrderService {

	List<Orders> findAll();
	Orders Record(Orders orders)throws Exception;
	
}
