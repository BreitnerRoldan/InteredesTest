package com.pruebaSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaSpring.entity.User;
import com.pruebaSpring.model.UserModel;
import com.pruebaSpring.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	private ResponseEntity<List<UserModel>> listar(){
		List<User> list = userService.findAll();
		List<UserModel> lista = new ArrayList<UserModel>();
		
		for (User u: list) {
			lista.add(new UserModel(u.getId(), u.getUserName(), u.getPassword(), u.getEmail()));
		}	
			return new ResponseEntity<List<UserModel>>(lista, HttpStatus.OK); 
	}
	
	public ResponseEntity<UserModel> crear(@RequestBody UserModel model) throws Exception{
		User u = new User(); 
		u.setUserName(model.getUserName());
		u.setEmail(model.getEmail());
		u.setPassword(model.getPassword());
		
		u = userService.Record(u); 
		
		return new ResponseEntity<UserModel>(new UserModel(u.getId(),u.getUserName(), 
				u.getEmail(), u.getPassword()), HttpStatus.CREATED); 
	}
}
