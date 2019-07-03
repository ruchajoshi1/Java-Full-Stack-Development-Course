/**
 * 
 */
package assignment;

import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class DataMining {

	/**
	 * @param args
	 * Data mining class
	 */
	public static void main(String[] args) {
		// Ask for user inputs

		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("First Name: ");
		Scanner input = new Scanner(System.in);
		String fname = input.next();
		System.out.println("Last Name: ");
		String lname = input.next();
		System.out.println("Grade (9-12): ");
		int grade = input.nextInt();
		System.out.println("Student ID: ");
		int id = input.nextInt();
		System.out.println("Login: ");
		String login = input.next();
		System.out.println("GPA (0.0-4.0): ");
		Double gpa = input.nextDouble();
	
		//Print user information
		System.out.println("Your Information:\n" + 
				"Login: " + login+ "\n" + 
				"ID: " + id + "\n" + 
				"Name: "+ lname + "," + fname + "\n" + 
				"GPA: " + gpa + "\n" + 
				"Grade: " + grade + "\n");
		input.close(); //close the scanner
	}
}
