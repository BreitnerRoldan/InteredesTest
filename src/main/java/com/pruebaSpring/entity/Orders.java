package com.pruebaSpring.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="order_id")
	private long orderId;
	
	@Column(name ="customer_id")
	private long customerId;
	
	@Column(name ="order_date")
	private Date orderDate; 
	
	@Column(name ="order_localization")
	private String orderLocalization;
	
	@ManyToOne
	@JoinColumn(name = "FK_CUSTOMERS", nullable = false, updatable = false)
	private Customers customers;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(long orderId, long customerId, Date orderDate, String orderLocalization, Customers customers) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.orderLocalization = orderLocalization;
		this.customers = customers;
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

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

}
