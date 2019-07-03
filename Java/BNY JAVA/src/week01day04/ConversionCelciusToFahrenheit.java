/**
 * 
 */
package week01day04;
import java.util.Scanner;
/**
 * @author rucha.joshi
 *
 */
public class ConversionCelciusToFahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double answer;
		//enter the temperature for conversion 
		System.out.println("Please enter fahrenheit temperature for conversion:");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		
		answer = (5.0/9.0)*(number - 32);
		//or answer = (5d/9)*(number - 32);
		
		// example for promotion and casting
		byte b = 50;
		byte c = 2;
		// b = b * c; - this is giving compile error
		b *= c;
		
		b = (byte)(b * 2);
		
		
		System.out.println(number + " fahrenheit " + "into celcius is " + answer);
	}

}
