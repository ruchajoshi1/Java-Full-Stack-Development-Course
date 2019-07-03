/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Slide99_Create2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3;
		int column = 4;
		int[][] arr = new int[3][4];
		int[][] arr1 = new int[3][4];
		char[][] arr2 = new char[3][4];
		int x = 10;
		
		//create an array with each element incrementing by 10
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				arr[i][j] = x;
				x += 10;
			}
		}
		
		//print all the elements
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		//create an array with generating random numbers
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				arr1[i][j] = (int)(Math.random()*100);				
			}
		}
		System.out.println(Arrays.deepToString(arr1));
		
		//create an array with generating random characters
				for(int i = 0; i<rows; i++) {
					for(int j=0; j<column; j++) {
						arr2[i][j] =  (char)('a' + Math.random()*('z'-'a'+1));				
					}
				}
				System.out.println(Arrays.deepToString(arr2));
	}

}
