package com.bnym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.TableGenerator;
import javax.validation.constraints.NotEmpty;

/*
 * Applicant has one address, this is address class for applicant
 */
@Entity
public class Address {
	
	@Id
	//@TableGenerator(name="address_seq", initialValue=0, allocationSize=50)
	//@GeneratedValue(strategy = GenerationType.TABLE, generator="address_seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message="Street can not be empty.")
	private String street;
	@NotEmpty(message="City name can not be empty.")
	private String city;
	@NotEmpty(message="State name con not be empty.")
	private String state;
	@NotEmpty(message="Zip code can not be empty.")
	private String zip;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
