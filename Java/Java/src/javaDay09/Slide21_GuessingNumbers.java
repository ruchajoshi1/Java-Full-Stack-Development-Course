/**
 * 
 */
package javaDay09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * generate a random number between 0 to 100 and ask user to enter a number to match
 * let him know if entered number is small or big compared with random generated number
 */
public class Slide21_GuessingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a random number
		Random rand = new Random();
		//generate a random number between 0 to 89 and then add 10 to get number between 10 to 99
		int number = rand.nextInt(101);
		int userInput = -1;
		
		//for testing
		//System.out.println("number: " + number);
		
		Scanner input = new Scanner(System.in);
			
		//ask for input till user entered number matches with random number generated.
		while(!(userInput == number)) {
			try {
				System.out.println("Please enter a number between 0 to 100: ");
				userInput = input.nextInt();
				}
				catch(Exception e) {
					System.out.println("Error!! Please try again.");
					input.nextLine();
					continue;
				}
			//check if user entered number is equal
			if (userInput == number) {
				System.out.println("Correct answer!!");
			} else if(userInput < number) {
				System.out.println("Input is too low. Please try again: ");
			} else {
				//check if user entered number is larger.
				System.out.println("Input is too high. Please try again: ");
			}
		}		
		input.close();
	}
}
