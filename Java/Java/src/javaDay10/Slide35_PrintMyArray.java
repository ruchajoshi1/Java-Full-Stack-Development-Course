/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Slide35_PrintMyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		//there are different ways of printing array elements 
		
		//1st way
		for(int element:arr) {
			System.out.println(element);
		}
		
		//2nd way
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Number: " +(i+1)+ " " +arr[i]);
		}
		
		//3rd way
		//printing array with standard Library Arrays.
		System.out.println(Arrays.toString(arr));

	}

}
