/**
 * 
 */
package assignment;
import java.util.Scanner;
/**
 * @author rucha.joshi
 */
public class Product {

	/**
	 * @param args
     * Ask user for two numbers and print product of those two numbers
	 */
	public static void main(String[] args) {
		// Declare variables
		double product;
		
		//Ask user for 2 numbers
		
		System.out.println("Please enter 1st number: ");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		
		System.out.println("Please enter 2nd number:");
		double number2 = input.nextDouble();
		
		product = number1 * number2;
		
		System.out.println("Product of the two given numbers is: " + product);
		input.close(); //close the scanner
	}

}
