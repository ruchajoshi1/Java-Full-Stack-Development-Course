package jpa.entitymodels;
/*
 * Student Class
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="email")
	private String sEmail;
	
	@Basic
	@Column(name = "name")
	private String sName;
	
	@Basic
	@Column(name = "password")
	private String sPass;
	
	@OneToMany
	List<Course> sCourses = new ArrayList<Course>();
	
	//empty constructor
	public Student() {
		
	}
	
	//Parameterized constructor
	/**
	 * @param sEmail
	 * @param sName
	 * @param sPass
	 * @param sCourses
	 */
	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	//get email
	public String getsEmail() {
		return sEmail;
	}
	
	//set email
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	//get name
	public String getsName() {
		return sName;
	}
	
	//set name
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	//get password
	public String getsPass() {
		return sPass;
	}

	//set password
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	// get courses
	public List<Course> getsCourses() {
		return sCourses;
	}
	
	//set courses
	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}
	
	//print method for Student
	public void printStudent() {
		System.out.printf("%-10s %-30s %-30s \n", this.sEmail,this.sName,this.sPass);
	}
	
}
