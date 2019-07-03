package com.JUNITDay2Slide4.services;

import java.util.List;

import com.JUNITDay2Slide4.entities.JPAUser;

public interface UserDAO {
	
	public boolean login(JPAUser jPAUser);
	public JPAUser getUserByEmail(String email);
	public List<JPAUser> findUsersByState(String state);
	public List<JPAUser> findUsersByZipcode(String zipCode);
	public void CreateUser(JPAUser jPAUser);
	public void DeleteUser(int userId);

}
