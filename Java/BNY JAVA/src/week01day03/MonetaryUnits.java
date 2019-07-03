/**
 * 
 */
package week01day03;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class MonetaryUnits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		int quarter;
		int dime;
		int nickel;
		int penny;
		int dollars;
		int totalcents;
		int remaining1;
		int remaining2;
		int remaining3;
		// Ask user to enter the amount
		System.out.println("Please enter the amount:");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		
		//find total cents		
		totalcents = (int) (amount * 100);
		//find dollars
		dollars = totalcents / 100;
		
		remaining1 = totalcents % 100;
		//find quarters
		quarter =  (remaining1/25);
		
		remaining2 = (remaining1 % 25);
		//find dimes
		dime =  (remaining2/10);
		remaining3 = remaining2 % 10;
		//find nickels
		nickel = remaining3/5;
		//find penny
		penny = remaining3 % 5;
		
		System.out.println("Amount " + amount + " has " + dollars + " dollars " + quarter + " quarters " +
		                    dime + " dimes " + nickel + " nickels " + penny + " pennys.");
		
					
	}

}
