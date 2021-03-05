package com.pruebaSpring.model;

import java.util.Date;

public class OrdersModel {
	
	private long orderId;
	private long customerId; 
	private Date orderDate; 
	private String orderLocalization;
	
	public OrdersModel() {
		// TODO Auto-generated constructor stub
	}

	public OrdersModel(long orderId, long customerId, Date orderDate, String orderLocalization) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.orderLocalization = orderLocalization;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderLocalization() {
		return orderLocalization;
	}

	public void setOrderLocalization(String orderLocalization) {
		this.orderLocalization = orderLocalization;
	}
	
	
}
