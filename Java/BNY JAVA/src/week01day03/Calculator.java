/**
 * 
 */
package week01day03;
import java.util.Scanner;
/**
 * @author rucha.joshi
 * Program to create a calculator
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		int option;
		double number1;
		double number2;
		double result = 0;

						
		System.out.println("Please enter number1 :");
		Scanner input = new Scanner(System.in);
		number1 = input.nextDouble();
		
		System.out.println("Please enter number2 :");
		number2 = input.nextDouble();
		
		System.out.println("Please enter the operation you want to do from below menu:");
				
		System.out.printf("1. Addition \n2. Subtraction \n3. Division \n4. Multiplication \n5. Remainder\n");
		option = input.nextInt();
		
				
		if (option == 1){
			result = number1 + number2;
		}
		else if (option == 2) {
			result = number1 - number2;
		}
		else if (option == 3) {
			result = number1 / number2;
		}
		else if (option == 4) {
			result = number1 * number2;
		}
		else if (option == 5) {
			result = number1 % number2;
		}
		else {
			System.out.println("Please enter the valid option.");
			}
		System.out.println("Your result is " + result);
		
	}

}
