/**
 * 
 */
package week01day04;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class SalesTaxNy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// NY tax sales rate is 8.875%
		
		double tax;
		
		System.out.println("What is the value of the product? - ");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		
		tax = (price * 8.875)/100;
		System.out.printf("The sales tax is: $%.2f", tax);
		
		//another way to do it - 
		//import java.text.DecimalFormat;
		//DecimalFormat df=new DecimalFormat("0.00");
		//String formate = df.format(value); 
		//double finalValue = (Double)df.parse(formate) ;
		
		//tax = Math.round((price * 8.875)/100d);
		//System.out.println(tax);
		
	}

}
