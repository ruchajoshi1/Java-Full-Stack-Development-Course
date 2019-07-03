package com.RelationJPA.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {	

	
	@Id 
	  private int dId; 
	  private String dName;
	  
	@OneToMany(targetEntity = Teacher.class)
	 private List teacherList;
	 

	  /**
	 * @param dId
	 * @param dName
	 */

	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.setdName(dName);
	}
	
	public Department() {
		
	}
	
	public Department(int dId, String dName, List teacherList) {
		super();
		this.dId = dId;
		this.setdName(dName);
		this.teacherList = teacherList;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
}
