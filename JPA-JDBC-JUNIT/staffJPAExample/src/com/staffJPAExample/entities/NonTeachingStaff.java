package com.staffJPAExample.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff{

	private String areaExpertise; 
	
	/**
	 * @param id
	 * @param sName
	 * @param areaExpertise
	 */
	public NonTeachingStaff(int id, String sName, String areaExpertise) {
		super(id, sName);
		this.areaExpertise = areaExpertise;
	}
	
	public NonTeachingStaff() {
		
	}

	public String getAreaExpertise() {
		return areaExpertise;
	}

	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}	

}
