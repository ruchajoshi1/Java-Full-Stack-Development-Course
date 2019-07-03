/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Slide104_BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = {0.2,0.5,0.6,0.1,2.7,5.9,1.7};
		double temp;
		
		//using 2 for loops
		for(int i=0;i<array.length-1;i++) {
			for(int j=0; j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println("iterations: " + i);
		}
		System.out.println(Arrays.toString(array));

	}

}
