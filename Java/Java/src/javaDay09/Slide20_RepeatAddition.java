/**
 * 
 */
package javaDay09;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Give 2 numbers to add and keep asking for the answer till you get the right answer.
 */
public class Slide20_RepeatAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize two integers
		int number1 = 12;
		int number2 = 5;
		
		//get the addition
		int add = number1 + number2;
		
		//ask user for answer
		System.out.println("What is " + number1 + "+" + number2 +"?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//check till the user enters correct answer
		while(answer != add) {
			System.out.println("Please try again.");
			answer = input.nextInt();
		}
		System.out.println("Correct answer!!");
		input.close();
	}

}
