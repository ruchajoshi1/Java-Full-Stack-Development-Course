/**
 * 
 */
package javaHackerRank;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  
 * lines of content.
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 *
 */
public class Java_EndOfFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int i = 1;
	        while (scan.hasNextLine()) { 
	            System.out.println(i + " " + scan.nextLine());
	            i++;
	        }
	        scan.close();

	}

}
