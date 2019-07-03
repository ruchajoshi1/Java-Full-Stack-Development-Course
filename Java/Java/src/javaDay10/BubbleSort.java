/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {11,4,5,3,7,2,9,6};
		int[] arr= {4,2};
		int temp;
		boolean flag = true;
		while(flag==true) {
			flag=false;
			for(int i=1; i<arr.length;i++) {
				if(arr[i-1]>arr[i]) {
					temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		//System.out.println(Arrays.toString(arr));
	}

}
