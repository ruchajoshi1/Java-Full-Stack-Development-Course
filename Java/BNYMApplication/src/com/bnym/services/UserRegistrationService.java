/**
 * 
 */

  package com.bnym.services;
  
  import java.util.List;

import com.bnym.entity.UserRegistration;
  
 /**
	 * @author rucha.joshi
	 *
	 */

  public interface UserRegistrationService {
		  
		  public List<UserRegistration> getAllUsers(); 
		  public UserRegistration getUserById(Long id); 
		  public boolean saveUser(UserRegistration user);
		  public boolean deleteUserById(Long id);
		  
		  }
		 