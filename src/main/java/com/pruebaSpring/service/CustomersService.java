package com.pruebaSpring.service;

import java.util.List;

import com.pruebaSpring.entity.Customers;

public interface CustomersService {
	
	List<Customers> findAll();
	Customers Record (Customers customers)throws Exception;
	void deleted (long id); 
	Customers update(Long id, Customers customers)throws Exception; 

}
