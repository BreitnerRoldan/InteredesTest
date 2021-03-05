package com.pruebaSpring.model;

public class OrderlineModel {
	
	private long orderLineId;
	private long orderId;
	private long productId;
	private int Quantity; 
	
	public OrderlineModel() {
		// TODO Auto-generated constructor stub
	}

	public OrderlineModel(long orderLineId, long orderId, long productId, int quantity) {
		this.orderLineId = orderLineId;
		this.orderId = orderId;
		this.productId = productId;
		Quantity = quantity;
	}

	public long getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(long orderLineId) {
		this.orderLineId = orderLineId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
