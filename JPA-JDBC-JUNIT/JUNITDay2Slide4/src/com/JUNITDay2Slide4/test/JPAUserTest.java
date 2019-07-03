package com.JUNITDay2Slide4.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.JUNITDay2Slide4.entities.JPAUser;

public class JPAUserTest {

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
	public final void testJPAUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testJPAUserIntStringStringStringStringStringString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetId() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetId() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetPassword() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetPassword() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAddress() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetAddress() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetZipCode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetZipCode() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	public final void testEqualsObject() {
		
		JPAUser expected = new JPAUser();
		expected.setId(1);
		expected.setEmail("default@live.com");
		expected.setPassword("123456");
		
		JPAUser actual = new JPAUser();
		actual.setId(1);
		actual.setEmail("default@live.com");
		actual.setPassword("123456");
		
		assertEquals(expected,actual);
	}

}
