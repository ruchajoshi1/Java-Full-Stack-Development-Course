/**
 * 
 */
package assignment;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class BmiCalculator {

	/**
	 * @param args
	 * BMI calculator
	 */
	public static void main(String[] args) {
		// Ask user for height and weight 
		
		System.out.println("Your height in meters:");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		
		System.out.println("Your weight in kg:");
		double weight = input.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.printf("Your BMI is %.5f", bmi);
		input.close(); //close the scanner
	}
}
