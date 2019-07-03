/**
 * 
 */
package com.JUNITDay2Slide4.main;


import com.JUNITDay2Slide4.entities.JPAUser;
import com.JUNITDay2Slide4.services.UserDAO;
import com.JUNITDay2Slide4.services.UserServices;

/**
 * @author rucha.joshi
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO us = new UserServices();
		JPAUser jPAUser = new JPAUser();
		jPAUser.setEmail("m@live.com");
		jPAUser.setPassword("123456");
		
		us.CreateUser(jPAUser);
		
		if(us.login(jPAUser)) {
			System.out.println("Welcome");
		}else {
			System.out.println("Bye");
		}
		
		
		JPAUser userInput = new JPAUser();
		userInput.setId(4);
		userInput.setEmail("emailNew@live.com");
		userInput.setAddress("addressNew");
		userInput.setName("nameDefault");
		userInput.setState("stateDefault");
		userInput.setZipCode("zipcodeDefault");
		
		us.CreateUser(userInput); 
		us.DeleteUser(3);

	}

}
