/**
 * 
 */
package javaDay10;

//import java.util.Arrays;
//import java.util.Scanner;

/**
 * @author rucha.joshi
 * Slide 3 problem
 * Generate/read one hundred numbers, compute their average, and find out how many numbers are above 
 * the average. 
 */
public class Slide3_AverageCalculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double avg;
		int counter = 0;
		int[] arr = new int[100];
			
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			total += arr[i];
		}
		
		//for(int i=0; i<arr.length; i++) {
		//	total += arr[i];
		//}

		//System.out.println(Arrays.toString(arr));
		
		//find average from total
		avg = total/arr.length;
		
		System.out.println("Average is: " + avg);
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>avg) {
				counter++;
			}
		}		
		System.out.println(counter + " numbers are above the average");		
	}
}
