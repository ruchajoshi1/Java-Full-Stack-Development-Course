package com.JPAExample.services;

import com.JPAExample.entities.Employee;

public interface EmployeeDao {
	
	void createEmployee(Employee newEmployee);
	Employee findEmployee(int eId);
	void updateEmployeePhone(int eid, String phone);
	void removeEmployee(int eid);
	public void getAllEmployees();
	public void getEmployee();
	public void getEmployeeNamedQuery();
}
