/**
 * 
 */
package javaDay08;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Ask user to enter a year and tell him the zodiac animal for the year.
 */
public class Slide46_ChineseZodiac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(year<1900 || year > 2100) {
			try {
			System.out.println("Please enter a year to know its zodiac animal:");
			year = input.nextInt();
			}
			catch(Exception e) {
				System.out.println("Please enter a year between 1900 and 2100.");
				input.nextLine();
				continue;
			}
		}
		
		//find the reminder by dividing 12
		int value = year % 12;
		
		//switch case for values 0 to 11 to get the zodiac animal
		switch(value) {
			case 0: System.out.println("Zodiac animal is: monkey"); break;
			case 1: System.out.println("Zodiac animal is: rooster"); break;
			case 2: System.out.println("Zodiac animal is: dog"); break;
			case 3: System.out.println("Zodiac animal is: pig"); break;
			case 4: System.out.println("Zodiac animal is: rat"); break;
			case 5: System.out.println("Zodiac animal is: ox"); break;
			case 6: System.out.println("Zodiac animal is: tiger"); break;
			case 7: System.out.println("Zodiac animal is: rabbit"); break;
			case 8: System.out.println("Zodiac animal is: dragon"); break;
			case 9: System.out.println("Zodiac animal is: snake"); break;
			case 10: System.out.println("Zodiac animal is: horse"); break;
			case 11: System.out.println("Zodiac animal is: sheep"); break;
		}
		input.close(); //close the scanner
	}

}
