package com.pruebaSpring.model;


public class UserModel {

	private long id;
	private String userName;
	private String email;
	private String Password;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public UserModel(long id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		Password = password;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
