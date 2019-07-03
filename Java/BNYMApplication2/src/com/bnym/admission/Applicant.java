package com.bnym.admission;

import java.util.Date;
import java.util.List;

/*
 * Class for applicant data from application form
 */
public class Applicant {

	private String aName;
	private String aCourse;
	private Long aMobile;
	private Date aDOB;
	private List<String> aSkills;
	private Address aAddress;
	
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
	public Long getaMobile() {
		return aMobile;
	}
	public void setaMobile(Long aMobile) {
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
