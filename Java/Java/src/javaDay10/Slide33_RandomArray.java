/**
 * 
 */
package javaDay10;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Slide33_RandomArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want in the array: ");
		length = scan.nextInt();
		
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Number: " +(i+1)+ " " +arr[i]);
		}
		scan.close();
	}

}
