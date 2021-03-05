package com.pruebaSpring.service;

import java.util.List;

import com.pruebaSpring.entity.Products;

public interface ProductsService {
	
	List<Products> findAll();
	Products Record(Products products)throws Exception;
	void deleted (long id); 
	Products update(Long id, Products products)throws Exception; 

}
