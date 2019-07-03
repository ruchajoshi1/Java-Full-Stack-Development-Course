/**
 * 
 */
package week01day03;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
		double sum;
		byte num = -128;
		// enter two numbers
		System.out.println("Please enter the number 1:");
		Scanner input = new Scanner(System.in);
		
		number1 = input.nextDouble();
	
		System.out.println("Please enter the number 2:");
		number2 = input.nextDouble();
		
		// add the given numbers to get sum
		sum = number1 + number2;
		
		System.out.println("Addition of the given numbers is:" + sum);
	}

}
