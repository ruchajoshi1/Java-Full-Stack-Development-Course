/**
 * 
 */

  package com.bnym.services;
  
  import java.util.ArrayList; import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.entity.UserRegistration; import
  com.bnym.repository.UserRegistrationRepository;
  
 /**
	 * @author rucha.joshi
	 *
	 */
  @Service
  @Transactional
 public class UserRegistrationServiceImpl implements UserRegistrationService {
		  
		  @Autowired private UserRegistrationRepository repository;
		  
		  
		  public UserRegistrationServiceImpl() { 
			  // TODO Auto-generated constructor stub
			 }
		  
		  @Autowired public UserRegistrationServiceImpl(UserRegistrationRepository
		  repository) { super(); this.repository = repository;
		  
		  }
		  
		  
		  @Override public List<UserRegistration> getAllUsers() {
		  List<UserRegistration> list = new ArrayList<UserRegistration>();
		  for(UserRegistration user :repository.findAll()) { list.add(user); }
		  
		  return list; }
		  
		  @Override public UserRegistration getUserById(Long id) { UserRegistration
		  user = repository.findById(id).get(); return user; }
		  
		  @Override public boolean saveUser(UserRegistration user) { try {
		  repository.save(user); return true; } catch (Exception e) {
		  e.printStackTrace(); return false; } }
		  
		  @Override public boolean deleteUserById(Long id) { try {
		  repository.deleteById(id);; return true; } catch (Exception e) {
		  e.printStackTrace(); return false; } }
		  
		  }
		 