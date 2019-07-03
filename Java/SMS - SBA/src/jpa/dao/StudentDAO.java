package jpa.dao;
/*
 * Interface for  Student class
 */
import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	//get all students
	List<Student> getAllStudents();
	// get student by email
	Student getStudentByEmail(String sEmail);
	//validate student
	boolean validateStudent(String sEmail, String sPassword);
	//register student to a course
	void registerStudentToCourse(String sEmail, int cId);
	//get courses for a student
	List<Course> getStudentCourses(String sEmail);
}
