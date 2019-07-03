package com.calculatorApplication.services;

public class Calculator {
	//include 4 operations
	//1. add(num1, num2) return result
	//1. subtract(num1, num2) return result
	//1. multiply(num1, num2) return result
	//1. divide(num1, num2) return result
	
	public int Add(int number1, int number2) {
		return number1 + number2;
	}
	
	public int Subtract(int number1, int number2) {
		return number1 - number2;
	}
	
	public int Multiply(int number1, int number2) {
		return number1 * number2;
	}
	
	public double Divide(double number1, int number2) {
		return number1 / number2;
	}

}
