/**
 * 
 */
package javaDay10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * The Airplane Seating Problem:

Scenario:
1) A plane has 26 rows labeled from A to Z and 10 columns labeled from 1 to 10.
2) There are two aisles on the plane. The first aisle is after 3rd column and the second aisle is after 7th column.
3) Families having 3 members wants to seat together in adjacent seats but not separated by an aisle.
4) Some seats are booked i.e. A4, A10, C5, D3, E6, F8.

Input:
Take already booked seat numbers as String (separated by a ,) from the keyboard.

Output:
The number of families who can seat together having the restriction mentioned in point 3.
As an example, output 10 means the airline company still can sell 30 tickets following the restriction.
 */
public class AirplaneProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 26;
		int columns = 10;
		
		Boolean[][] seats = new Boolean[26][10];
		//String[] reserved;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter reserved seats separated by comma and no space: ");
		String reserved = scan.next();
		
		//System.out.println("reserved: " + reserved);
		
		String[] reservedSeats = reserved.split(",");
		
		System.out.println(Arrays.toString(reservedSeats));
		
		//char[] newArray = new char[26];
		//char x = (char) (i+65);
		//int y = j+1;
		//seats[i][j] = Character.toString(x) + Integer.toString(y);
		
		//create an boolean array assuming no seats are booked first setting all false
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				seats[i][j] = false;
			}
		}
		//print the seats array
		//System.out.println(Arrays.deepToString(seats));
		
		
		//separate the digit and letter in each spring array element
		for(int i = 0;i<reservedSeats.length;i++) {
			System.out.println(reservedSeats[i]);
			String[] part = reservedSeats[i].split("(?<=\\D)(?=\\d)");
			System.out.println(part[0]);
			int x = Integer.valueOf(part[0]);
			System.out.println("x:" + x);
			System.out.println(part[1]);		
			int y = Integer.parseInt(part[1]);
			System.out.println("y:" + y);
		} 
		
		/*
		String str = "A10";
		
		String[] part = str.split("(?<=\\D)(?=\\d)");
		System.out.println(part[0]);
		System.out.println(part[1]);
		*/	
		/*int counter = -1;
		for(char j ='A';j<='Z';j++) {
			if (part[0] == Character.toString(j)) {
				counter++;					
			}
			
		}*/
		scan.close();
	}
}
