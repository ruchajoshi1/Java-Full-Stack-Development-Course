/**
 * 
 */
package javaDay10;

import java.util.Scanner;

/**
 * @author rucha.joshi
 * Write a method to do linear search
 */
public class Slide85_LinearSearch {

	/**
	 * @param args
	 */
	public static int linearSearch(int[] list, int key) {
		for(int i =0; i<list.length; i++) {
			if(key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {1,2,3,4,5,6,7,8};
		//int key = 9;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sorted array: ");
		String array = scan.nextLine();
		
		array = array.replaceAll("\\s+","");
		
		String[] newArray = array.split(",");
		
		int[] arr = new int[newArray.length];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(newArray[i]);
		}
		
		System.out.println("Please enter the key to search in an given array: ");
		int key = scan.nextInt();
		
		int result = linearSearch(arr,key);
		if(result == -1) {
			System.out.println("Element is not present in the array.");
		} else {
			System.out.println("Element is present at index: " + result);
		}
		
		scan.close();
	}

}
