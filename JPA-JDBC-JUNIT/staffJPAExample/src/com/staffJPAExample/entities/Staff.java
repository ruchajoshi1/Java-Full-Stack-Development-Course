package com.staffJPAExample.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Staff {
	
	/**
	 * @param id
	 * @param sName
	 * @param qualification
	 * @param subjectExpertise
	 * @param areaExpertise
	 */
	@Id
	private int id;
	private String sName;
	
	public Staff(int id, String sName) {
		super();
		this.id = id;
		this.sName = sName;
	}

	//Enity needs empty constructor definition
	public Staff() {
		
	}
	
	public int getId() {
		return id;
	}
	
	/* we don't want to set primary key
	public void setId(int id) {
		this.id = id;
	}
	*/
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
}
