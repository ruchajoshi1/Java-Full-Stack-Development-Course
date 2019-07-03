/**
 * 
 */
package javaHackerRank;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Java Output Formatting
 */
public class Output_Formatting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.println("================================");
	        for (int i = 0; i < 3; i++) {
	            String s1 = scan.next();
	            int x = scan.nextInt();
	            System.out.printf("%-15s%03d%n", s1, x);
	        }
	        scan.close();
	        System.out.println("================================");
	}

}
