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

import com.pruebaSpring.entity.Products;
import com.pruebaSpring.model.ProductsModel;
import com.pruebaSpring.service.ProductsService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@GetMapping
	public ResponseEntity<List<ProductsModel>> listAll() {

		List<Products> list = productsService.findAll();
		List<ProductsModel> lista = new ArrayList<ProductsModel>();

		for (Products c : list) {
			lista.add(new ProductsModel(c.getProductId(), c.getDescripcion(), true, c.getPurchasePrice(),
					c.getSellingPrice(), c.getWeight(), c.getStorageLocation()));
		}
		return new ResponseEntity<List<ProductsModel>>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<ProductsModel> RecordCustomer(@RequestBody ProductsModel model) throws Exception {
		Products r = new Products();

		r.setDescripcion(model.getDescripcion());
		r.setPurchasePrice(model.getPurchasePrice());
		r.setSellingPrice(model.getSellingPrice());
		r.setWeight(model.getWeight());
		r.setStorageLocation(model.getStorageLocation());

		r = productsService.Record(r);

		return new ResponseEntity<ProductsModel>(new ProductsModel(0, r.getDescripcion(), true, r.getPurchasePrice(),
				r.getWeight(), 0, r.getStorageLocation()), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") long id) throws Exception {
		productsService.deleted(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProductsModel> updateCustomer(@PathVariable(name = "id") Long id,
			@RequestBody ProductsModel model) throws Exception {
		Products entity = new Products();
		entity.setProductId(id);
		entity.setDescripcion(model.getDescripcion());
		entity.setAvailable(true);
		entity.setSellingPrice(model.getSellingPrice());
		entity.setWeight(model.getWeight());
		entity.setStorageLocation(model.getStorageLocation());

		entity = productsService.update(id, entity);

		return new ResponseEntity<ProductsModel>(
				new ProductsModel(entity.getProductId(), entity.getDescripcion(), true, entity.getPurchasePrice(),
						entity.getSellingPrice(), entity.getWeight(), entity.getStorageLocation()),
				HttpStatus.ACCEPTED);

	}
}
