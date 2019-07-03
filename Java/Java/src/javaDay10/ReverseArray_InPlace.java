/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * reverse the given array in place.
 *
 */
public class ReverseArray_InPlace {

	/**
	 * @param args
	 *  program to reverse a number array in place (change the same array)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println("Original array:" + Arrays.toString(arr));
		
		//for loop to reverse the array in place. run the loop till length/2
		for(int i=0, j=arr.length-1; i<arr.length/2; i++, j--) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			//System.out.println("arr[i]: " + arr[i] + "arr[j]" + arr[j]);
		}		
		System.out.println("Reversed array in place:" + Arrays.toString(arr));
				
	}
}
