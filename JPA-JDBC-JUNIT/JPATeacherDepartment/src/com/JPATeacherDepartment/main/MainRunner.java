package com.JPATeacherDepartment.main;

import com.JPATeacherDepartment.services.TeacherDepartmentServices;
import com.JPATeacherDepartment.services.TeacherDepartmentServicesDAOI;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherDepartmentServicesDAOI newEvent = new TeacherDepartmentServices();
		
		newEvent.createTable();

	}

}
