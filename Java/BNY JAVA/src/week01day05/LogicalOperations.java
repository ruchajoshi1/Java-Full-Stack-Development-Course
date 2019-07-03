/**
 * 
 */
package week01day05;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class LogicalOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ask for 2 input numbers
		System.out.println("Please enter number1: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
				
		if (number1 % 2 == 0 && number1 % 3 == 0) {
			System.out.println("Your number is divisible by 2 and 3 both.");
		}
		else if (number1 % 2 == 0 ^ number1 % 3 == 0) {
			System.out.println("Your number is divisible either 2 or 3 but not both.");
		}
		else {
			System.out.println("Your number is not divisible by either 2 or 3.");
		}
		
		
	}

}
