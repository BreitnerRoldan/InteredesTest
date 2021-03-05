package com.pruebaSpring.servciceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pruebaSpring.entity.Customers;
import com.pruebaSpring.repository.CustomersRepository;
import com.pruebaSpring.service.CustomersService;

@Service
public class CustomersServiceImpĺ implements CustomersService {

	@Autowired
	private CustomersRepository customersRepository;

	@Override
	public List<Customers> findAll() {
		return customersRepository.findAll();
	}

	@Override
	public Customers Record(Customers customers) throws Exception {
		Optional<Customers> c = customersRepository.findById(customers.getCustomerId());

		if (c.isPresent()) {
			throw new Exception("Ya existe un cliente con id " + customers.getCustomerId());
		}

		return customersRepository.save(customers);
	}

	@Override
	public void deleted(long id) {
		customersRepository.deleteById(id);
	}

	@Override
	public Customers update(Long id, Customers customers) throws Exception {
		
			Optional<Customers> o = customersRepository.findById(id);
			
			if (o.isPresent() && o.get().getCustomerId() != customers.getCustomerId()) {
				throw new Exception("Ya existe un customer con primer nombre " + customers.getFirstName());
			}
			
			Customers pr = o.get();
			pr.setFirstName(customers.getFirstName());
			pr.setLastName(customers.getLastName());
			pr.setCountry(customers.getCountry());
			pr.setCity(customers.getCity());
			pr.setCodigoPOstal(customers.getCodigoPOstal());
			pr.setStreet(customers.getStreet());
			pr.setHouseNumber(customers.getHouseNumber());
			
			return customersRepository.save(pr);
	}

}
