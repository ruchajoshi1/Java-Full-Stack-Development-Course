/**
 * 
 */

package com.bnym.repository;
  
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnym.entity.UserRegistration;
  
 /**
	 * @author rucha.joshi
	 *
	 */
 @Repository
 public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Long>{
		  
 }
		 