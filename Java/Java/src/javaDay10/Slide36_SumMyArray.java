/**
 * 
 */
package javaDay10;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Slide36_SumMyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5};
		
		double total = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want in the array: ");
		int length = scan.nextInt();
		
		int[] arr = new int[length];
		//generating random numbers in an array
		for(int i=0; i<length; i++) {
			arr[i] = (int)(Math.random()*100);
		}

		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println("The total is: " + total);
		
		//overwrite array elements with new value by subtracting current value from total 
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)((total) - arr[i]);
			System.out.println("New array elements: " + arr[i]);
		}
		scan.close();
	}

}
