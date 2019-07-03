/**
 * 
 */
package javaDay08;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Slide 34 Lottery
 * Generate a random 2 digit number and ask user for 2 digit number and 
 * compare digits to see if user wins a lottery.
 */
public class Lottery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a random number
		Random rand = new Random();
		//generate a random number between 0 to 89 and then add 10 to get number between 10 to 99
		int number = rand.nextInt(90) + 10;
		
		System.out.println("number: " + number);
		
		int userInput = 0;
		int numberLastDigit, numberFirstDigit;
		int userInputLastDigit, userInputFirstDigit;
		
		Scanner input = new Scanner(System.in);
		
		//check userInput if <10 or >100 as we need 2 digit number
		while(userInput<10 || userInput>=100) {
			try {
			System.out.println("Please enter the two digit number: ");
			userInput = input.nextInt();
			}
			catch(Exception e) {
				System.out.println("Error!! Please enter two digit positive integer.");
				input.nextLine();
				continue;
			}
		}
		
		//separate the digits from random number generated
		numberLastDigit = number % 10;
		numberFirstDigit = number / 10;
		
		//separate the digits from user entered number
		userInputLastDigit = userInput % 10;
		userInputFirstDigit = userInput / 10;
		
		
		if (number == userInput) {
			System.out.println("Congratualtions!!! Your number matches exactly. You won $10,000.");
		} else if((numberLastDigit == userInputFirstDigit)&&(numberFirstDigit == userInputLastDigit)) {
			System.out.println("Congratualtions!!! Your number matches digits but not exact. You won $3,000.");
		} else if((numberLastDigit == userInputLastDigit)||(numberFirstDigit == userInputFirstDigit)||
				(numberLastDigit == userInputFirstDigit)|| (numberFirstDigit == userInputLastDigit)) {
			System.out.println("Congratualtions!!! You entered one matching digit. You won $1,000.");
		} else {
			System.out.println("Sorry better luck next time!!");
			System.out.println("The number was: " + number);
		}
		input.close(); //close the scanner
	}

}
