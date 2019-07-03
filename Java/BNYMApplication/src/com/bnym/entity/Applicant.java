package com.bnym.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.TableGenerator;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/*
 * Class for applicant data from application form
 */
@Entity
public class Applicant {
	
	@Id
	//@TableGenerator(name="applicant_seq", initialValue=0, allocationSize=50)
	//@GeneratedValue(strategy = GenerationType.TABLE, generator="applicant_seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message="Applicant name can not be empty.")
	@Size(max=25,message="name must be less than 25 characters.")
	private String aName;
	
	@NotEmpty(message="Course name can not be empty.")
	private String aCourse;
	
	@NotEmpty(message="Phone number can not be empty.")
	@Pattern(regexp="^(\\(\\d{3}\\)|\\d{3})-?\\d{3}-?\\d{4}$", message="Please enter valid phone number.")
	private String aMobile;
	
	@NotNull
	@Past(message="Date of birth must be a past date.")
	private Date aDOB;
	
	@NotEmpty(message="Please select at least one skill.")
	//@ElementCollection(targetClass=String.class)
	@ElementCollection(fetch=FetchType.EAGER, targetClass=String.class) 
	private List<String> aSkills;
	
	@NotNull 
	@Valid
	@OneToOne(cascade= CascadeType.ALL,orphanRemoval=true)
	private Address aAddress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaCourse() {
		return aCourse;
	}
	public void setaCourse(String aCourse) {
		this.aCourse = aCourse;
	}
	public String getaMobile() {
		return aMobile;
	}
	public void setaMobile(String aMobile) {
		this.aMobile = aMobile;
	}
	public Date getaDOB() {
		return aDOB;
	}
	public void setaDOB(Date aDOB) {
		this.aDOB = aDOB;
	}
	public List<String> getaSkills() {
		return aSkills;
	}
	public void setaSkills(List<String> aSkills) {
		this.aSkills = aSkills;
	}
	public Address getaAddress() {
		return aAddress;
	}
	public void setaAddress(Address aAddress) {
		this.aAddress = aAddress;
	}
}
