/**
 * 
 */
package assignment;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class AgeInFiveYears {

	/**
	 * @param args
	 * This program tells your age after 5 years and before 5 years from now.
	 */
	public static void main(String[] args) {
		// 
		
		System.out.println("Hi there. What's your name?"); 
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		System.out.println("Hi," + name + "! My name is Java. Nice to meet you.");
		System.out.println("How old are you? ");
		int age = input.nextInt();

		System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
		System.out.println("And five years ago you were " + (age-5) + "! Imagine that!");
		input.close(); //close the scanner
	}
}
