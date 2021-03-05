package com.pruebaSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaSpring.entity.Customers;
import com.pruebaSpring.model.CustomersModel;
import com.pruebaSpring.service.CustomersService;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomersController {

	@Autowired
	private CustomersService customersService;

	@GetMapping
	public ResponseEntity<List<CustomersModel>> listAll() {

		List<Customers> list = customersService.findAll();
		List<CustomersModel> lista = new ArrayList<CustomersModel>();

		for (Customers c : list) {
			lista.add(new CustomersModel(c.getCustomerId(), c.getFirstName(), c.getLastName(), c.getCountry(),
					c.getCity(), c.getCodigoPOstal(), c.getStreet(), c.getHouseNumber()));
		}
		return new ResponseEntity<List<CustomersModel>>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CustomersModel> RecordCustomer(@RequestBody CustomersModel model) throws Exception {
		Customers r = new Customers();
		r.setFirstName(model.getFirstName());
		r.setLastName(model.getLastName());
		r.setCountry(model.getCountry());
		r.setCity(model.getCity());
		r.setCodigoPOstal(model.getCodigoPOstal());
		r.setStreet(model.getStreet());
		r.setHouseNumber(model.getHouseNumber());

		r = customersService.Record(r);

		return new ResponseEntity<CustomersModel>(new CustomersModel(r.getCustomerId(), r.getFirstName(),
				r.getLastName(), r.getCountry(), r.getCity(), r.getCodigoPOstal(), r.getStreet(), r.getHouseNumber()),
				HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") long id) throws Exception {
		customersService.deleted(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CustomersModel> updateCustomer(@PathVariable(name = "id") Long id,
			@RequestBody CustomersModel model) throws Exception {
		Customers entity = new Customers();
		entity.setCustomerId(id);
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setCountry(model.getCountry());
		entity.setCity(model.getCity());
		entity.setCodigoPOstal(model.getCodigoPOstal());
		entity.setStreet(model.getStreet());
		entity.setHouseNumber(model.getHouseNumber());

		entity = customersService.update(id, entity);

		return new ResponseEntity<CustomersModel>(new CustomersModel(entity.getCustomerId(), entity.getFirstName(),
				entity.getLastName(), entity.getCountry(), entity.getCity(), entity.getCodigoPOstal(),
				entity.getStreet(), entity.getHouseNumber()), HttpStatus.ACCEPTED);

	}
}
