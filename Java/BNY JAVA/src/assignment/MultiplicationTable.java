/**
 * 
 */
package assignment;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * print a multiplication table for the entered number.
 */
public class MultiplicationTable {

	/**
	 * @param args
     * print a multiplication table for the entered number.
	 */
	public static void main(String[] args) {
		// Declare variables
		int n = 10;
		
		//Ask for user input
		System.out.println("Please enter the number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		//
		for(int i=1;i <= n; i++) {
			System.out.println(number + " x " + i + " = " + (number*i));
		}	
		input.close(); //close the scanner
	}

}
