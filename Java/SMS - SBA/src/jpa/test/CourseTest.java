package jpa.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.service.StudentService;

public class CourseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testEqualsObject() {
		Course expectedCourse = new Course();
		expectedCourse.setcId(1);
		expectedCourse.setcName("English");
		expectedCourse.setcInstructorName("Anderea Scamaden");
		
		/*
		 * Course actualCourse = new Course(); 
		 * actualCourse.setcId(1);
		 * actualCourse.setcName("English");
		 * actualCourse.setcInstructorName("Anderea Scamaden");
		 */
		
		StudentDAO student = new StudentService();
		Course actualCourse = new Course(); 
		
		//get a course list from a student
		List<Course> courseList = student.getStudentCourses("hluckham0@google.ru");
		
		for(Course course:courseList) {
			if(course.equals(expectedCourse)) {
				actualCourse = course;
			}
		}			
		
		assertEquals(expectedCourse,actualCourse);
		
		//fail("Not yet implemented"); // TODO
	}

}
