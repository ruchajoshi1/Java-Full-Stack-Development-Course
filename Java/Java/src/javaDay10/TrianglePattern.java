/**
 * 
 */
package javaDay10;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class TrianglePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		int length = scan.nextInt();
		
		for(int i = 0; i<length; i++) {
			for(int j = 1;j<length-i;j++) {
				System.out.print("$");//adding space
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");//adding * and space
			}
			System.out.println();
		}
		scan.close();
	}

}
