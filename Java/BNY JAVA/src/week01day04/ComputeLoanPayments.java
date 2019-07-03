/**
 * 
 */
package week01day04;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class ComputeLoanPayments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double monthlyPayment;
		double totalPayment;
		double totalMonths;
		double denominator;
		double finalAmount;
		// Ask user for interest rate, no. of years, loan amount
		
		System.out.println("Please enter the interest rate: ");
		Scanner input = new Scanner(System.in);
		double interest = input.nextDouble();
		System.out.println("Please enter number of years: ");
		int years = input.nextInt();
		System.out.println("Please enter the loan amount: ");
		double loanAmount = input.nextDouble();
		
		//monthlyPayment = (loanAmount * interest)/(1- (1/((1+interest)^(years*12))));
		totalPayment = loanAmount * (interest/1200);
		totalMonths = years * 12;
		denominator = Math.pow((1 + (interest/1200)),totalMonths);
		monthlyPayment = (totalPayment)/(1-(1/denominator));
		
		System.out.printf("Your monthly payment will be: $%.2f", monthlyPayment);
		
		//Calculate the final amount paid
		finalAmount = monthlyPayment * years * 12;
		
		System.out.printf("\n Your total payment will be: $%,.2f", finalAmount);
	}

}
