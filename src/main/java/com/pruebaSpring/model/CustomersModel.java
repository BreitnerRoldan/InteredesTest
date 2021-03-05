package com.pruebaSpring.model;

public class CustomersModel {

	
	private long customerId; 
	private String firstName; 
	private String lastName;
	private String country;
	private String city;
	private int codigoPOstal;
	private String street;
	private String houseNumber; 
	
	public CustomersModel() {
		// TODO Auto-generated constructor stub
	}

	public CustomersModel(long customerId, String firstName, String lastName, String country, String city,
			int codigoPOstal, String street, String houseNumber) {
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
	
}
