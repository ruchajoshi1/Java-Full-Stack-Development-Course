/**
 * 
 */
package javaDay10;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Write a method to do bineary search
 *
 */
public class Slide90_BinearySearch {

	/**
	 * @param args
	 */
	public static int binearySearch(int[] arr, int key) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while(startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex)/2;
			
			if(arr[midIndex] == key) {
				return midIndex;
			}
			
			if(arr[midIndex] < key) {
				startIndex = midIndex + 1;				
			}
			
			if(arr[midIndex] > key) {
				endIndex = midIndex - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5,6,7,8};
		//int key = 10;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of an array: ");
		int length = scan.nextInt();
		
		int[] arr = new int[length];
		System.out.println("Please enter sorted array: ");
		for(int i = 0; i<length; i++) {
			arr[i] = scan.nextInt();
		}
		/*
		String array = scan.nextLine();
		
		array = array.replaceAll("\\s+","");
		
		String[] newArray = array.split(",");
		
		int[] arr = new int[newArray.length];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(newArray[i]);
		}
		 */
		
		System.out.println("Please enter the key to search in an given array: ");
		int key = scan.nextInt();
		
		int result = binearySearch(arr,key);
		if(result == -1) {
			System.out.println("Element is not present in the array.");
		} else {
			System.out.println("Element is present at index: " + result);
		}
		scan.close();
	}

}
