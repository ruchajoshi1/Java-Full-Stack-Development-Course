/**
 * 
 */
package javaHackerRank;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Sample Output - 
 * -150 can be fitted in:
* short
* int
* long
* 150000 can be fitted in:
* int
* long
* 1500000000 can be fitted in:
* int
* long
* 213333333333333333333333333333333333 can't be fitted anywhere.
* -100000000000000 can be fitted in:
* long
*
*/
public class Java_DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        for (int i = 0; i < t; i++) {
	            try {
	                long x = scan.nextLong();
	                System.out.println(x + " can be fitted in:");
	                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
	                    System.out.println("* byte");
	                }
	                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
	                    System.out.println("* short");
	                }
	                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
	                    System.out.println("* int");
	                }
	                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
	                    System.out.println("* long");
	                }
	            } catch (Exception e) {
	                System.out.println(scan.next() + " can't be fitted anywhere.");
	            }
	        }
	        scan.close();

	}

}
