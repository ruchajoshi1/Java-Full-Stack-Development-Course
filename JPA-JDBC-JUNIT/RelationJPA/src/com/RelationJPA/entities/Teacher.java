package com.RelationJPA.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
		
	@Id
	private int eId;
	private String eName;
	private double eSalary;
	
	
	@ManyToOne 
	private Department department;
	 
	//constructor for department relation
	public Teacher(int eId, String eName, double eSalary, Department department) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.department = department;
	}
	
	//empty constructor
	public Teacher() {
		
	}
	
	//constructor for Credentials
	public Teacher(int eId, String eName, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;		
	}
	
	public int geteId() {
		return eId;
	}
	
	/*
	public void seteId(int eId) {
		this.eId = eId;
	}
	*/
	
	public String geteName() {
		return eName;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public double geteSalary() {
		return eSalary;
	}
	
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

}
