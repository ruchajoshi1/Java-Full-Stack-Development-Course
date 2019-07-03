package com.JPATeacherDepartment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher2 {
	
	/**
	 * @param eId
	 * @param eName
	 * @param eSalary
	 */

	@Id
	private int eId;
	private String eName;
	private double eSalary;
	
	
	public Teacher2(int eId, String eName, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public Teacher2() {
		
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
