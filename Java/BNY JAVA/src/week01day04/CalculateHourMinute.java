/**
 * 
 */
package week01day04;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class CalculateHourMinute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int input;
		int hour;
		int minute;
		
		//Ask for input
		System.out.println("Please enter minutes to convert into hour and minute:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		//input = 229;
		// Get hours by dividing by 60 and reminder as minutes
		hour = number / 60;
		minute = number % 60;
		
		System.out.println(number + " minutes means " + hour + " hours " + "and " + minute + " minutes");
	

	}

}
