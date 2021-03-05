package com.pruebaSpring.model;

public class ProductsModel {
	
	private long productId;
	private String descripcion;
	private boolean available;
	private float purchasePrice;
	private float sellingPrice; 
	private int weight; 
	private String storageLocation; 
	
	public ProductsModel() {
		// TODO Auto-generated constructor stub
	}

	public ProductsModel(long productId, String descripcion, boolean available, float purchasePrice, float sellingPrice,
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
