package com.JUNITDay2Slide4.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.JUNITDay2Slide4.entities.JPAUser;

public class UserServices implements UserDAO {

	@Override
	public boolean login(JPAUser jPAUser) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUNITDay2Slide4");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String givenEmail = jPAUser.getEmail();
		String givenPassword = jPAUser.getPassword();
		Query queryLogin = entityManager.createQuery("SELECT user from JPAUser user where user.email = :givenEmail and user.password = :givenPassword");;
		
		queryLogin.setParameter("givenEmail", givenEmail);
		queryLogin.setParameter("givenPassword", givenPassword);
		
		@SuppressWarnings("unchecked")
		List<JPAUser> userList = queryLogin.getResultList();
		
		entityManager.close();
		entityManagerFactory.close();
		
		if(userList.size() > 0) {
			System.out.println("User: " + userList.get(0).getEmail());
			return true;
		}
			return false;
		
	}

	public void CreateUser(JPAUser jPAUser) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUNITDay2Slide4");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(jPAUser);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	public void DeleteUser(int userId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUNITDay2Slide4");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		JPAUser foundUser = entityManager.find(JPAUser.class, userId);
		entityManager.remove(foundUser);
		//entityManager.persist(jPAUser);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	@Override
	public JPAUser getUserByEmail(String email) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUNITDay2Slide4");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Query query = entityManager.createQuery("SELECT user from User user where user.email = :givenEmail");
		
		entityManager.close();
		entityManagerFactory.close();
		return null;
	}

	@Override
	public List<JPAUser> findUsersByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JPAUser> findUsersByZipcode(String zipCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
