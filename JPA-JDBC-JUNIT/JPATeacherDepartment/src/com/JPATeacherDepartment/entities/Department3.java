package com.JPATeacherDepartment.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department3 {
	
	@Id 
	  private int dId; 
	  private String dName;
	 
	  @OneToMany(targetEntity = Teacher3.class)
	  private List teacherList;
	  
	  /**
	 * @param dId
	 * @param dName
	 */
	public Department3(int dId, String dName, List teacherList) {
		super();
		this.dId = dId;
		this.setdName(dName);
		this.teacherList = teacherList;
	}
	
	public Department3() {
		
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	
}
