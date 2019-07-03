package com.staffJPAExample.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff{
	
	private String qualification;
	private String subjectExpertise;
	
	/**
	 * @param id
	 * @param sName
	 * @param qualification
	 * @param subjectExpertise
	 */
	public TeachingStaff(int id, String sName, String qualification, String subjectExpertise) {
		super(id, sName);
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
	}
	
	public TeachingStaff() {
		
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}
	

}
