package com.JPATeacherDepartment.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.JPATeacherDepartment.entities.Department2;
import com.JPATeacherDepartment.entities.Teacher2;

public class TeacherDepartmentServices implements TeacherDepartmentServicesDAOI {

	public void createTable() {
		//set up entity manager
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPATeacherDepartment");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		
		Teacher2 teacher1 = new Teacher2(1,"Mike",60000);
		entitymanager.persist(teacher1);
		
		Teacher2 teacher2 = new Teacher2(2,"Bairon",80000);
		entitymanager.persist(teacher2);
		
		List<Teacher2> teacherList = new ArrayList<Teacher2>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		
		Department2 dept1 = new Department2(1,"Test Department",teacherList);
		entitymanager.persist(dept1);
		
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();	
		
	}
	}
	
/*
	public void createTable() {
		//set up entity manager
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPATeacherDepartment");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		
		Teacher2 teacher1 = new Teacher2(1,"Mike",60000);
		entitymanager.persist(teacher1);
		
		Teacher2 teacher2 = new Teacher2(2,"Bairon",80000);
		entitymanager.persist(teacher2);
		
		List<Teacher2> teacherList = new ArrayList<Teacher2>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		
		Department2 dept1 = new Department2(1,"Test Department",teacherList);
		entitymanager.persist(dept1);
		
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();			
	}
	*/

	/*
	public void createTable() {		
		//set up entity manager
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPATeacherDepartment");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		
		Department dept1 = new Department(1,"Test Department");
		entitymanager.persist(dept1);
		
		Teacher teacher1 = new Teacher(1,"Mike",60000,dept1);
		entitymanager.persist(teacher1);
		
		Teacher teacher2 = new Teacher(2,"Bairon",80000,dept1);
		entitymanager.persist(teacher2);
		
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();			
	}
	*/

