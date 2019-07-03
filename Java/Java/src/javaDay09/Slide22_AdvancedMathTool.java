/**
 * 
 */
package javaDay09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * generate 5 subtraction problems with random single digit numbers ask for answer
 * check how answers are correct and ask again for incorrect answers.
 */
public class Slide22_AdvancedMathTool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0; // to count correct answers
		int i = 0; //for while loop for 5 questions
		int userAnswer;
		
		//create a random number
		Random rand = new Random();
		
		Scanner input = new Scanner(System.in);
		
		while(i<5) {
		//generate a random number between 0 to 9 and then add 10 to get number between 10 to 99
		int number1 = rand.nextInt(10);
		int number2 = rand.nextInt(10);
		
		System.out.println("What is " + number1 + "-" + number2 +"?");
		
		userAnswer = input.nextInt();
		int answer = number1 - number2;
		if(userAnswer == answer) {
			counter++;
		}
			i++;// for number of questions
		}
		System.out.println("You got " + counter + " correct answers.");
		input.close();
	}

}
