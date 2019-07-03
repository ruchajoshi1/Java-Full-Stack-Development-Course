/**
 * 
 */
package javaDay10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * write a code to right shift the array by 2 positions
 */
public class Slide39_RightShiftBy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {89, 67, 10,9,7,3, 1};
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of right shifts you want to do in an array: ");
		int shift = scan.nextInt();
		
		//if shift is greater than length of array
		if(shift >= arr.length) {
			shift = shift % arr.length;
		}
		
		//shift elements to right 2 times
		//while(count<2) {
		while(count<shift) {
			//save the last element of the array in the temporary variable
			int temp = arr[arr.length-1];
			//shift elements to right
			for(int i = arr.length-1;i>0;i--) {
				arr[i] = arr[i-1]; 
			}
			//put the last element back to initial position
			arr[0]=temp;
			
			count++;
		}
		System.out.println(Arrays.toString(arr));		
		scan.close();
	}
}

/* code to do left shift 
int temp = arr[0];
for(int i = 1; i<arr.length; i++){
	arr[i-1] = arr[i];
}
arr[arr.length-1] = temp
System.out.println(Arrays.toString(arr));
*/