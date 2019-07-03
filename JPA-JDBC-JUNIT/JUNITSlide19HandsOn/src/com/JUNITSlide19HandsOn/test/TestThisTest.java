package com.JUNITSlide19HandsOn.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.JUNITSlide19HandsOn.services.TestThis;

public class TestThisTest {

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
	public final void testGetNameAtIndex() {
		//Test 1 Data:	▶ Input = 2	▶ Expected = “Tony”
		//Test 2 Data:	▶ Input = 0	▶ Expected = “Mike”
		
		TestThis test = new TestThis();
		
		//String name = test.getNameAtIndex(2);
		
		assertEquals("Tony",test.getNameAtIndex(2));
		assertEquals("Mike",test.getNameAtIndex(0));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAddName() {
		//Input = “Jared” Expected = Last entry of getNames()
		TestThis test = new TestThis();
		test.addName("Jared");
		//assertEquals()
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetNames() {
		//TestThis test = new TestThis();
		//assertEquals(test.getNames()
		//fail("Not yet implemented"); // TODO
	}

}
