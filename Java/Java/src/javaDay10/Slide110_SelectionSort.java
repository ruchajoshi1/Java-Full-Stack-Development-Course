/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Slide110_SelectionSort {

	/**
	 * @param args
	 */
	public static void sorter(int[] num) {
		for(int i=0; i<num.length;i++) {
			int currentNumber = num[i]; //temporary variable to store before swap
			int index = i;//store current index
			//System.out.println("currentNumber: " + currentNumber);
			for(int j=i+1;j<num.length;j++) {
				//if found smaller number then change currentNumber to smaller number and compare again
				if(currentNumber > num[j]) {
					currentNumber = num[j];
					index = j;
				}
			}
			//do the swap with smallest number found.
			if(index != i) {
			num[index] = num[i];
			num[i] = currentNumber;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,4,1,2,3,4,2,0,-1};
		
		sorter(array);
		
		System.out.println("Sorted array: " + Arrays.toString(array));

	}

}
