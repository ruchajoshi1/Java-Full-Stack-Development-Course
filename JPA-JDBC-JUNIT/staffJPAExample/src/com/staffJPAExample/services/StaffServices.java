package com.staffJPAExample.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.staffJPAExample.entities.NonTeachingStaff;
import com.staffJPAExample.entities.TeachingStaff;

public class StaffServices implements StaffServicesDAOI{

	
	public void createTable() {
		//set up entity manager
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("staffJPAExample");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		
		TeachingStaff ts = new TeachingStaff(1,"Mike","Something","CS");
		NonTeachingStaff ns = new NonTeachingStaff(2,"Maria","finding People job");
		
		entitymanager.persist(ts);
		entitymanager.persist(ns);
		
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();			
	}

}
