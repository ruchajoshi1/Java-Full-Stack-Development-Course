package com.JUNITDay2Slide4.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.JUNITDay2Slide4.entities.JPAUser;
import com.JUNITDay2Slide4.services.UserServices;

public class UserServicesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testLogin() {
		//1. expected values
		//2. get actual value
		//3. assert
		
		//test case 1 - email = "m@live.com", password = "123456"
		UserServices us = new UserServices();
		JPAUser user = new JPAUser();
		user.setEmail("m@live.com");
		user.setPassword("123456");
		
		boolean expected = us.login(user);
		
		assertTrue(expected);	//passed
		
		//test case 2 email = "xyz@live.com" password = "123456x"
		
		/*
		 * UserServices us = new UserServices(); 
		 * JPAUser user = new JPAUser();
		 */
		user.setEmail("xyz@live.com");
		user.setPassword("123456x");
		
		expected = us.login(user);
		
		assertFalse(expected); //failed
		
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCreateUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDeleteUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserByEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByZipcode() {
		fail("Not yet implemented"); // TODO
	}

}
