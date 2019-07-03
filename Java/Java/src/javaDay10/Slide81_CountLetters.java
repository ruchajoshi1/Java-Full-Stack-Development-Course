/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * Generate 100 lower case letters randomly and assign to an array of characters.
 * Count the occurrence of each letter in the array. 
 */
public class Slide81_CountLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = new char[100];
		int counter=0;
		
		//generate an array of length 100 with random characters
		for(int i = 0;i < arr.length; i++) {
			arr[i] = (char)('a' + Math.random()*('z'-'a'+1));
		}
		
		System.out.println(Arrays.toString(arr));
		
		//sort the array in place
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				//count the single characters or last character
				counter++;
				System.out.println("Char " + arr[i-1] + " occured " + counter + " times.");
				//reset the counter
				counter =0;
			}else {
				//increase the counter for matching characters
				counter ++;
			}
		}

	}

}
