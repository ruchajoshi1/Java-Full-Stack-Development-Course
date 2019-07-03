package com.JUNITDay2Slide4.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JPAUser {
	
	@Id
	private int id;
	private String email;
	private String name;
	private String password;
	private String address;
	private String state;
	private String zipCode;
	
	public JPAUser() {
		
	}
	
	/**
	 * @param id
	 * @param email
	 * @param name
	 * @param password
	 * @param address
	 * @param state
	 * @param zipCode
	 */
	public JPAUser(int id, String email, String name, String password, String address, String state, String zipCode) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof JPAUser) {
			JPAUser other = (JPAUser) obj;
			boolean sameId = (this.id == other.getId());
			boolean sameEmail = this.email.equals(other.getEmail());
			boolean samePassword = this.password.equals(other.getPassword());
			if(sameId && sameEmail && samePassword) {
				return true;
			}else {return false;}
		}else {
			return false;
		}
	}
	

}
