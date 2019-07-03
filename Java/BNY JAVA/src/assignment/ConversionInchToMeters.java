/**
 * 
 */
package assignment;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class ConversionInchToMeters {

	/**
	 * @param args
	 * Ask user for input in inches and convert it into meters
	 */
	public static void main(String[] args) {
		// Declare variables
		double inches;
		double meters;
		
		// Ask user for input
		System.out.println("Please enter the number in inch: ");
		Scanner input = new Scanner(System.in);
		inches = input.nextDouble();
				
		//Convert inches into meters
		meters = inches * 0.0254;
		
		//Print output
		System.out.println(inches + " inches " + "is " + meters + " meters.");
		input.close(); //close the scanner
	}
}
