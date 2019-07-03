/**
 * 
 */
package exceptionTesting;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class ExceptionTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		int counter = 0;
		while(counter<3) {
			System.out.println("Please provide the divisor: ");
		
		try {
			int number = input.nextInt();
			int i = 1/number;
			
			System.out.println("Result is: " + i);
			
			int[] numbers = {1,2,3,4,5};
			System.out.println(numbers[5]);
					
		} catch(ArithmeticException e) {
			
			System.out.println("That was an arithmetic division error occured by 0!!");
			System.out.println("Please try again.");
			//e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("Please provide a number.");
			System.out.println("Please try again.");
		} catch(ArrayIndexOutOfBoundsException e) {
		//catch(Exception e) {
			//exception gives generalized error			
			//System.out.println("Please try again!! Array error");
			System.out.println("The highest index you can use is 4");
		}finally {
			System.out.println("That's it! You tried your best!");
		}
		counter++;
		}
		System.out.println("Outside of try-catch-finally!");
			input.close();
	}

}
