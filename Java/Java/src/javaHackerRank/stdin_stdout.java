/**
 * 
 */
package javaHackerRank;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class stdin_stdout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Integer: ");
        int i = scan.nextInt();
        System.out.println("Double: ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("String: ");
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();

	}

}
