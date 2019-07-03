/**
 * 
 */
package com.calculatorApplication.main;

import com.calculatorApplication.services.Calculator;

/**
 * @author rucha.joshi
 *
 */
public class CalculatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Basic Calculator");
		
		int number1 = 5;
		int number2 = 3;
		int result;
		
		Calculator calc = new Calculator();
		
		result = calc.Add(number1, number2);		
		System.out.println("Add method: " + result);
		
		result = calc.Subtract(number1, number2);		
		System.out.println("Subtract method: " + result);
		
		result = calc.Multiply(number1, number2);		
		System.out.println("Multiply method: " + result);
		
		double result1 = calc.Divide(number1, number2);		
		System.out.println("Divide method: " + result1);

	}

}
