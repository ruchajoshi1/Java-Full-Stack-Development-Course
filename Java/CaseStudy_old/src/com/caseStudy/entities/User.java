package com.caseStudy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	private int userId;
	
	@Basic
	private String userName;
	
	@Basic
	private String email;
	
	@Basic
	private String password;
	
	@Basic
	private String address;
	
	@Basic
	private String phone;
	
	public User() {
		
	}
	
	/**
	 * @param userId
	 * @param userName
	 * @param email
	 * @param password
	 * @param address
	 * @param phone
	 */
	public User(int userId, String userName, String email, String password, String address, String phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
