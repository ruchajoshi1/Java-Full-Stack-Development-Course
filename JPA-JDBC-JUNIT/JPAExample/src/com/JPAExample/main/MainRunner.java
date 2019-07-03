package com.JPAExample.main;

import java.util.Scanner;

import com.JPAExample.entities.Employee;
import com.JPAExample.services.EmployeeDao;
import com.JPAExample.services.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		EmployeeDao employeeDao = new EmployeeService();
		
		//find an employee for user entered id
		System.out.println("Please enter employee id to find: ");
		int id = scan.nextInt();
		Employee foundEmployee = employeeDao.findEmployee(id);
		foundEmployee.printEmployee();
		
		
		 //create a new employee 
		 Employee newEmployee = new Employee(102,"Rucha","Joshi","201-222-7767");		 
		 employeeDao.createEmployee(newEmployee); 
		 foundEmployee = employeeDao.findEmployee(102);		  
		 foundEmployee.printEmployee();
		 
		
		//update phone number
		 employeeDao.updateEmployeePhone(102, "201-222-9999");
		foundEmployee = employeeDao.findEmployee(102);		 
		foundEmployee.printEmployee();
		
		//remove employee
		employeeDao.removeEmployee(102);
		foundEmployee = employeeDao.findEmployee(102);	
		if(foundEmployee == null) {
			System.out.println("Employee not found.");
		}
		//foundEmployee.printEmployee();
		
		//get all employees
		employeeDao.getAllEmployees();
		
		//get employee by id
		employeeDao.getEmployee();
		
		//get employee by id using named query
		employeeDao.getEmployeeNamedQuery();
		
		scan.close();
	}
}
