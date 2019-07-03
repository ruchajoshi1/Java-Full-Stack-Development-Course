package jpa.entitymodels;

/*
 * Course class
 */
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@Column(name = "id")
	private int cId;
	
	@Basic
	@Column(name="name")
	private String cName;
	
	@Basic
	@Column(name = "instructor")
	private String cInstructorName;
	
	//empty constructor
	public Course() {
		
	}
	
	//Parameterized constructor
	/**
	 * @param cId
	 * @param cName
	 * @param cInstructorName
	 */
	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}
	
	//get course id
	public int getcId() {
		return cId;
	}

	//set course id
	public void setcId(int cId) {
		this.cId = cId;
	}

	//ge course name
	public String getcName() {
		return cName;
	}
	
	//set course name
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	//get instructor name
	public String getcInstructorName() {
		return cInstructorName;
	}
	
	//set instructor name
	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}
	
	//print course method
	public void printCourse() {
		System.out.printf("%-10s %-30s %-30s \n", this.cId,this.cName,this.cInstructorName);
	}
	
	//equal method for Junit object comparison
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Course) {
			Course other = (Course) obj;
			boolean sameId = (this.cId == other.getcId());
			boolean sameName = this.cName.equals(other.getcName());
			boolean sameInstructorName = this.cInstructorName.equals(other.getcInstructorName());
			if(sameId && sameName && sameInstructorName) {
				return true;
			}else {return false;}
		}else {
			return false;
		}
	}

}
