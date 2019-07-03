package com.JPAExample.entities;

public abstract class Animal {
	
	int noOfLegs;
	String name;
	
	public void walk() {
		System.out.println("Inside Animal class.");
	}

}
