/**
 * 
 */
package javaDay09;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Ask user to enter integers till he enters 0 and add them all and print the sum. 
 * here loop ends when user input is zero, zero is a sentinel value.
 */
public class Slide23_CalculateSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int userInput = -1;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an interger: ");
		int userInput = input.nextInt();
		
		while(userInput != 0) {
			sum = sum + userInput;
			System.out.println("Please enter another interger");
			userInput = input.nextInt();
			System.out.println("Sum at this point is: " + (sum + userInput));
		}	
		
		

		System.out.println("Total is: " + sum);
		input.close();
	}

}
