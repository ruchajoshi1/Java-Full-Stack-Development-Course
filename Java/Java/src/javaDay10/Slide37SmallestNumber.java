/**
 * 
 */
package javaDay10;

//import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Slide37SmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-3,4,-5,-15,100};
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Number in the array is: " + min);
	}

}
