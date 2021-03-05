package com.pruebaSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_line")
public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Order_line_id")
	private long orderLineId;
	
	@Column(name="order_id")
	private long orderId;
	
	@Column(name ="product_id")
	private long productId;
	
	@Column(name ="quantity")
	private int quantity; 
	
	
	public OrderLine() {
		// TODO Auto-generated constructor stub
	}

	public OrderLine(long orderLineId, long orderId, long productId, int quantity) {
		this.orderLineId = orderLineId;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		
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
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
