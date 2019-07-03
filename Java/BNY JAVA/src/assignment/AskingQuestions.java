/**
 * 
 */
package assignment;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * 
 */
public class AskingQuestions {

	/**
	 * @param args
	 * This class is for asking questions to the user.
	 */
	public static void main(String[] args) {
		// Declare variables
		
		String name;
		int age;
		double wage;
		
		System.out.println("Hello. What's your name?");
		Scanner input = new Scanner(System.in);
		name = input.next();

		System.out.println("Hi " +  name + "! How old are you?");
		age = input.nextInt();

		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		wage = input.nextDouble();
		
		System.out.println(wage + "! That's really good for your " + age + " age!");
		input.close(); //close the scanner
	}
}
