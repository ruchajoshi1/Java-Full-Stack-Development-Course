/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Slide48_CopyingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {7,8,9,4};
		
		arr2 = arr1;//this not copying it is assigning same memory to 2 different arrays.
		
		arr2[2] = 99;//both array will have new value.
		
		System.out.println(Arrays.toString(arr1));//this will have arr1 values
		System.out.println(Arrays.toString(arr2));//this will have arr1 values
		
		System.out.println(arr1);//both will have same memory address
		System.out.println(arr2);

	}

}
