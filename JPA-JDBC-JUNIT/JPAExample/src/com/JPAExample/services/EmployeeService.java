package com.JPAExample.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import org.eclipse.persistence.expressions.ExpressionBuilder;
//import org.eclipse.persistence.internal.jpa.rs.metadata.model.Query;
//import org.eclipse.persistence.jpa.JpaEntityManager;
//import org.eclipse.persistence.jpa.JpaHelper;

import com.JPAExample.entities.Employee;

public class EmployeeService implements EmployeeDao {
	
	//create a new employee and insert into database
	public void createEmployee(Employee newEmployee) {
		//set up entity manager
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		//perform your actions on database
		entitymanager.persist(newEmployee);
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();		
	}
	
	//find employee based on primary key (id)
	public Employee findEmployee(int eId) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		Employee foundEmployee = entitymanager.find(Employee.class, eId);
		entitymanager.close();
		entitymanagerfactory.close();	
		return foundEmployee;
	}

	//update employee phone number based on id
	public void updateEmployeePhone(int eid, String phone) {
        EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
        EntityManager entitymanager = entitymanagerfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Employee foundEmployee = entitymanager.find(Employee.class, eid);
        foundEmployee.setPhoneNo(phone);
        entitymanager.getTransaction().commit();
        entitymanager.close();
		entitymanagerfactory.close();	
   }
   
	//remove employee from database based on id
   public void removeEmployee(int eid) {
        EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
        EntityManager entitymanager = entitymanagerfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Employee foundEmployee = entitymanager.find(Employee.class, eid);
        entitymanager.remove(foundEmployee);
        entitymanager.getTransaction().commit();
        entitymanager.close();
		entitymanagerfactory.close();	
   }
   
	/*
	 * //find employee based on employee name public Employee
	 * findProjectsWithName(String name) { ExpressionBuilder builder = new
	 * ExpressionBuilder(); JpaEntityManager jpaEm = JpaHelper.getEntityManager(em);
	 * Query query =
	 * jpaEm.createQuery(builder.get("name").equals(builder.getParameter(
	 * "projectName")), Project.class); query.setParameter("projectName", name);
	 * Collection projects = query.getResultList(); return projects; }
	 */
   
   //use JPQL to get single employee
   public void getAllEmployees() {
	   EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
       EntityManager entitymanager = entitymanagerfactory.createEntityManager();
       
       Query query = entitymanager.createQuery("SELECT E FROM Employee E");
       List<Employee> employees = query.getResultList();
       
       for(Employee emp:employees) {
    	   System.out.println(emp.toString());
       }
       
       entitymanager.close();
       entitymanagerfactory.close();
   }
   
   //method to get an employee
   public void getEmployee() {
	   EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
       EntityManager entitymanager = entitymanagerfactory.createEntityManager();
       
       Query query = entitymanager.createQuery("SELECT E FROM Employee E where e.employeeId = :givenId");
       query.setParameter("givenId", 15);
       
       Employee employee = (Employee) query.getSingleResult();       
       System.out.println(employee.toString());
       
       entitymanager.close();
       entitymanagerfactory.close();
   }
   
   //method to get employee by id using named query
   public void getEmployeeNamedQuery() {
	   EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("JPAExample");
       EntityManager entitymanager = entitymanagerfactory.createEntityManager();
       
       Query query = entitymanager.createNamedQuery("Find Employee by Id");
       query.setParameter("givenId", 20);
       
       Employee employee = (Employee) query.getSingleResult();       
       System.out.println(employee.toString());
       
       entitymanager.close();
       entitymanagerfactory.close();
   }
}
