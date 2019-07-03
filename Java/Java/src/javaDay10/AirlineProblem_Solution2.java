/**
 * 
 */
package javaDay10;

//import java.util.Arrays;
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
public class AirlineProblem_Solution2 {

	/**
	 * @param args
	 */
	public static int getRow(char c) {
		return (int)(c-'A');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 26;
		int columns = 10;
		
		Boolean[][] seats = new Boolean[26][10];
		
		//initialise the array with true
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				seats[i][j] = true;
			}
		}
		
		//ask user for reserved seats
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter reserved seats separated by comma and no space: ");
		//String reserved = scan.next(); it reads just until he space
		String reserved = scan.nextLine(); // to read data including space
		
		//use method to remove spaces from user input
		reserved = reserved.replaceAll("\\s+", "");
				
		System.out.println("reserved seats are: " + reserved);
		
		//split the reserved array by comma to get string array
		String[] reservedSeats = reserved.split(",");
		//System.out.println(Arrays.toString(reservedSeats));
		
		//set reserved seats to false
		for(int i = 0; i<reservedSeats.length;i++) {
			String temp = reservedSeats[i];
			int row = Integer.valueOf(getRow(temp.charAt(0)));
			//
			int column = Integer.valueOf(temp.substring(1))-1;
			seats[row][column] = false;
		} 
		
		//System.out.println(Arrays.toString(reservedSeats));
			
		//create an boolean array assuming no seats are booked first setting all false
				
		int count = 0;
				
		for(int i=0;i<seats.length;i++) {
			int j = 0;
			//code to check first 3 columns - 0,1,2
			if(seats[i][j]&&seats[i][j+1]&&seats[i][j+2]) {
				count++;
			}
			//code to check middle 4 columns  - 3,4,5,6
			if(seats[i][j+4]&&seats[i][j+5]&&seats[i][j+6]) {
				count++;
			} else if(seats[i][j+3]&&seats[i][j+4]&&seats[i][j+5]) {
				count++;
			}
			
			//code to check last 3 columns - 7,8,9
			if(seats[i][j+7]&&seats[i][j+8]&&seats[i][j+9]) {
				count++;
			}
		} 
		
		System.out.println(count + " families can still book the tickets.");
		
		scan.close();
	}
}
