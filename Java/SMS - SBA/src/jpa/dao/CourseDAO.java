package jpa.dao;
/*
 * Course Interface
 */
import java.util.List;

import jpa.entitymodels.Course;

public interface CourseDAO {
	//method to get all the courses
	List<Course> getAllCourses();

}
