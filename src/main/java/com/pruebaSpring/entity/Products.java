package com.pruebaSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name ="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private long productId;
	
	@Column(name ="description")
	private String descripcion;
	
	@Column(name ="available")
	private boolean available;
	
	@Column(name="purchase_price")
	private float purchasePrice;
	
	@Column(name = "selling_price")
	private float sellingPrice; 
	
	@Column(name = "weight")
	private int weight; 
	
	@Column(name ="storange_location")
	private String storageLocation;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(long productId, String descripcion, boolean available, float purchasePrice, float sellingPrice,
			int weight, String storageLocation) {
		this.productId = productId;
		this.descripcion = descripcion;
		this.available = available;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.weight = weight;
		this.storageLocation = storageLocation;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

}
