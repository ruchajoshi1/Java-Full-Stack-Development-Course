package studentCourses;

import java.util.List;

public class Student {
	//instance variables for the class Student
	int sId;
	String sName;
	List<Course> sCourse;//List of Courses; list is the interface we can use arraylist or linkedlist
	
	//student constructor
	Student(int sId, String sName, List<Course> sCourse){
		this.sId = sId;
		this.sName = sName;
		this.sCourse = sCourse;
	}
	
	//method to print student info
	void printStudent() {
		System.out.println(sId);//as sId is a variable from the same class we can use it directly
		System.out.println(sName);
		//System.out.println(l1); this is printing address
		for(Course c: sCourse) {
			System.out.println(c.cName);
		}
	}
	
	// method to drop a course from student course list
	void dropCourse(String dropCourseName) {
		for(int i=0;i<sCourse.size();i++) {
			System.out.println();
		}
	}
	
}
