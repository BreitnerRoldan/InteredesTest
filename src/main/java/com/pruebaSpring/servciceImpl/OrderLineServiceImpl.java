package com.pruebaSpring.servciceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSpring.entity.Customers;
import com.pruebaSpring.entity.OrderLine;
import com.pruebaSpring.repository.OrderLineRepository;
import com.pruebaSpring.service.OrderLineService;

@Service
public class OrderLineServiceImpl implements OrderLineService{

	@Autowired
	private OrderLineRepository orderLineRepository;

	@Override
	public OrderLine Record(OrderLine orderLine) throws Exception {
			Optional<OrderLine> c = orderLineRepository.findById(orderLine.getOrderLineId());

			if (c.isPresent()) {
				throw new Exception("Ya existe una Orden con id " + orderLine.getOrderLineId());
			}

			return orderLineRepository.save(orderLine);
	}
}
