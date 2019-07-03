package com.JPAExample.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "JPAEMPLOYEENEW")
@NamedQuery(query = "SELECT E FROM Employee E where e.employeeId = :givenId", name="Find Employee by Id")
public class Employee {
	
	@Id
	@Column(name = "EMPLOYEEID")
	private int employeeId;
	
	@Basic
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Basic
	@Column (name = "LASTNAME")
	private String lastName;
	
	@Basic
	@Column (name = "PHONE")
	private String phoneNo;
	
	public Employee(int employeeId, String firstName, String lastName, String phoneNo) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	public Employee() {
		super();
	}
	
	public void printEmployee() {
		System.out.println(this.employeeId + " " + this.firstName + " " + this.lastName + " " + this.phoneNo);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	/* Id annotation should not have setter method as it should be immutable
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	*/
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return this.employeeId + " " + this.firstName + " " + this.lastName + " " + this.phoneNo;
	}
}
