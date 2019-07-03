/**
 * 
 */
package assignment;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class TheDumbCalculator {

	/**
	 * @param args
	 * simple calculator
	 */
	public static void main(String[] args) {
		// Ask for user input
		System.out.println("What is your first number? ");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		System.out.println("What is your second number? ");
		double number2 = input.nextDouble();
		System.out.println("What is your third number? ");
		double number3 = input.nextDouble();
		
		double result = (number1+number2+number3)/2;
		
		System.out.println("(" + number1 + " + " + number2 + " + " + number3 + ")/2" + " is... \n" + result + "!");
		input.close(); //close the scanner
	}

}
