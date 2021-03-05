package com.pruebaSpring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name= "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name = "country")
	private String country;
	
	@Column(name ="city")
	private String city;
	
	@Column(name ="codigo_postal")
	private int codigoPOstal;
	
	@Column(name="street")
	private String street;
	
	@Column(name="house_number")
	private String houseNumber; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customers")
	private List<Orders> orders;
	
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(long customerId, String firstName, String lastName, String country, String city, int codigoPOstal,
			String street, String houseNumber) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.city = city;
		this.codigoPOstal = codigoPOstal;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCodigoPOstal() {
		return codigoPOstal;
	}

	public void setCodigoPOstal(int codigoPOstal) {
		this.codigoPOstal = codigoPOstal;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
}
