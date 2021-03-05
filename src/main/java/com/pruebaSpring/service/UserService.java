package com.pruebaSpring.service;

import java.util.List;

import com.pruebaSpring.entity.Customers;
import com.pruebaSpring.entity.User;

public interface UserService {

	List<User> findAll();
	User Record (User user)throws Exception;
	void deleted (long id); 
	User update(Long id, User user)throws Exception; 
}
