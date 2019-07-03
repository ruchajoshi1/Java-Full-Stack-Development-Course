package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {
	
	//get all students
	@Override
	public List<Student> getAllStudents() {
		// Get all the students list
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//query to get all the students
		Query query = entityManager.createQuery("SELECT S FROM Student S");
		
		List<Student> studentList = query.getResultList();	
		
		if(studentList == null) {
			System.out.println("There are no students.");
			System.exit(0);
		}
		
		/*
		 * for(Student student:studentList) { System.out.println(student.toString()); }
		 */
		
		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();
		return studentList;	
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		// Get student by email
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//find the student by email
		Student foundStudent = entityManager.find(Student.class, sEmail);
		
		//System.out.println(foundStudent.toString());
		
		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();
		
		return foundStudent;
		
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		// Match email and password in the database to validate the student
		boolean found = false;
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//find the student by email
		Student foundStudent = entityManager.find(Student.class, sEmail);
		
		if(foundStudent == null) {
			System.out.println("Your email Id is not matching with our records.");
		}else {
			//check for password match
			if(foundStudent.getsPass().equals(sPassword)) {
				found= true;
			}
		}		

		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();
		
		//return statement
		if(found) {
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// Register a student for a new course
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//find the student
		Student student = entityManager.find(Student.class, sEmail);
		//if student with email not found in the database
			if(student == null) {
				System.out.println("Sorry student with this email is not present.");
				System.exit(0);
			}
		//find the course
			Course course = entityManager.find(Course.class, cId);
			if(course == null) {
				System.out.println("Sorry course is not present with the given course Id.");
				System.exit(0);
			}
		
		//get the list of courses student has enrolled
		List<Course> courses = student.getsCourses();
		
		//check if already registered for the course
		if(courses.contains(course)) {
			System.out.println("You are already registered in that course!");
		}else {
			courses.add(course);
		}
		//persist the data in the database
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		
		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// Get the list of all the courses for a student
		//create entity manager and entity manager factory connection
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//find the student by email
		Student student = entityManager.find(Student.class, sEmail);
		
		//if student with email not found in the database
		if(student == null) {
			System.out.println("Sorry student with this email is not present.");
			System.exit(0);
		}
		//list all the courses for the student
		List<Course> courses = student.getsCourses();
		
		//close entity manager and entity manager factory
		entityManager.close();
		entityManagerFactory.close();
		
		//return courses
		return courses;
	}

}
