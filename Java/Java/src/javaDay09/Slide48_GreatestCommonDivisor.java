/**
 * 
 */
package javaDay09;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Slide48_GreatestCommonDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter positive integer number: ");
		int	number1 = input.nextInt();
		System.out.println("Please enter second positive integer number: ");
		int	number2 = input.nextInt();
		
		//for loop to find greatest common divisor
		for(int i=1;(i<=number1 || i<=number2);i++) {
			if ((number1%i==0) && (number2%i==0)) {
				temp = i;			
			}				
		}		
		System.out.println("Greatest common divisor for " + number1 + " and " + number2 + " is " + temp);
		input.close();
	}

}
