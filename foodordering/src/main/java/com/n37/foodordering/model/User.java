package com.n37.foodordering.model;

import java.util.Date;

public class User {

	
	private Long id;
	private String fullName;
	private String userName;
	private String userPassword;
	private String email;
	private String phone;

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPhone() {
		return phone;
	}

	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}