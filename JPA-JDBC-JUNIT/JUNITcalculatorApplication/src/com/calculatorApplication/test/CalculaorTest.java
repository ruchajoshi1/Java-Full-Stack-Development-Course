package com.calculatorApplication.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calculatorApplication.services.Calculator;

public class CalculaorTest {

	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
	 * 
	 * @AfterClass public static void tearDownAfterClass() throws Exception { }
	 * 
	 * @Before public void setUp() throws Exception { }
	 * 
	 * @After public void tearDown() throws Exception { }
	 */

	@Test
	public final void testAdd() {
		int n = 2;
		int m = 1;
		int expected = 3;
		Calculator calc  = new Calculator();
		
		int actual = calc.Add(n, m);
		
		assertEquals(expected,actual);
		
		//assertEquals(2,new Calculator().add(1,1))
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSubtract() {
		assertEquals(2,new Calculator().Subtract(3,1));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMultiply() {
		assertEquals(3,new Calculator().Multiply(3,1));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDivide() {
		assertEquals(1.5,new Calculator().Divide(3.0,2),5);
		//fail("Not yet implemented"); // TODO
	}

}
