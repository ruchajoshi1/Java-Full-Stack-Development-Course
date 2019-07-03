/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * Random shuffling
 */
public class Slide38_RandomShuffling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6};
		
		/*for(int i=0;i<arr.length; i++) {
			
		}*/
		
		for(int i=5; i>0; i--) {
			int j = (int)(Math.random()*(i+1));
			System.out.println("J is: " + j);
			
			//swap arr[i] with arr[j]
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
