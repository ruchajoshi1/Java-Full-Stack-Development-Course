/**
 * 
 */
package javaDay08;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Day 08 Slide 5
 * Simple Math Learning Tool
 * Create two single digit random numbers and ask user addition of those numbers
 * Check if answer is correct or not and print a message.
 * 
 * Another way to get random number - 
 * import java.util.Random
 * Random rand = new Random();
 * int n = rand.nextInt(50); - it will create number between 0 to 49
 */
public class RandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random()*10);
		//Math.random returns between 0 and 1 so need to multiply by 10 to get single digit number.
		int number2 = (int)(Math.random()*10);
		System.out.println("What is " + number1 + "+" + number2 +"?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		int add = number1 + number2;
		
		if (add == answer) {
			System.out.println("Your answer is correct!");
		}
		else {
			System.out.println("Sorry your answer is wrong.");
			System.out.println("Answer is " + add);
		}
		input.close(); //close the scanner
	}
}
