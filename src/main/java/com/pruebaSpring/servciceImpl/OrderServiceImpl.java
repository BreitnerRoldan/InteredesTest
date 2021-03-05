package com.pruebaSpring.servciceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSpring.entity.Orders;
import com.pruebaSpring.repository.OrderRepository;
import com.pruebaSpring.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Orders> findAll() {
		return orderRepository.findAll();
	}
	@Override
	public Orders Record(Orders orders) throws Exception {
	return orderRepository.save(orders); 
	}
}
