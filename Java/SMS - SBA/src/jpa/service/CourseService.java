package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO{

	@Override
	public List<Course> getAllCourses() {
		// Get the list of all the courses
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//get all the courses from database
		Query query = entityManager.createQuery("SELECT C FROM Course C");
		
		List<Course> courseList = query.getResultList();	
		
		if(courseList == null) {
			System.out.println("There are no courses avaialable.");
		}
		
		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();

		return courseList;
	}

}
