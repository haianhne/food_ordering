package com.n37.foodordering.model;

import java.util.Date;

public class User {

	
	private Integer id;
	
	private String fullName;
	
	private String userName;
	
	private String userPassword;
	
	private String email;
	
	private String phone;
	
	private String userRole;
	
	private String avatar;
	
	private Boolean isActive;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
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

	
	public String getUserRole() {
		return userRole;
	}

	
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	
	public String getAvatar() {
		return avatar;
	}

	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	
	public Boolean getIsActive() {
		return isActive;
	}

	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}