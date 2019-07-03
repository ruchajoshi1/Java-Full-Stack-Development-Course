package javaDay10;

import java.util.Arrays;

public class Slide95_TwoDimensionalArray {
/*
 * How to create a two-dimensional array
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[][] numberArr = new int[6][5];
		
		//numberArr[0][0] = 10;
		//numberArr[0][1] = 12;
		
		int rows=3;
		int column = 5;
		
		int[][] numberArr = new int[][] {{10,12,43,11,22},
			{20,45,56,1,33},
			{30,67,32,14,44}} ;
			
			for(int i = 0; i<rows; i++) {
				for(int j =0; j<column; j++) {
					System.out.print(numberArr[i][j] + " ");
				}
				System.out.println(" ");
			}
		
			System.out.println(numberArr[1][0]);
			System.out.println(Arrays.toString(numberArr[0]));
		
	}

}
