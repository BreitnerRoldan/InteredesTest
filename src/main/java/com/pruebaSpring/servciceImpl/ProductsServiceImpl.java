package com.pruebaSpring.servciceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSpring.entity.Products;
import com.pruebaSpring.repository.ProductsRepository;
import com.pruebaSpring.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public List<Products> findAll() {
		return productsRepository.findAll();
	}

	@Override
	public Products Record(Products products) throws Exception {
		Optional<Products> c = productsRepository.findById(products.getProductId());

		if (c.isPresent()) {
			throw new Exception("Ya existe un cliente con id " + products.getProductId());
		}

		return productsRepository.save(products);
	}

	@Override
	public void deleted(long id) {
		productsRepository.deleteById(id);
	}

	@Override
	public Products update(Long id, Products products) throws Exception {
		Optional<Products> p = productsRepository.findById(id);
		
		if (p.isPresent() && p.get().getProductId() != products.getProductId()) {
			throw new Exception("Ya existe un producto con id " + products.getProductId());
		}
		
		Products pr = p.get();
		pr.setDescripcion(products.getDescripcion());
		pr.setAvailable(true);
		pr.setPurchasePrice(products.getPurchasePrice());
		pr.setSellingPrice(products.getSellingPrice());
		pr.setWeight(products.getWeight());
		pr.setStorageLocation(products.getStorageLocation());
		
		return productsRepository.save(pr);
		}

	}
