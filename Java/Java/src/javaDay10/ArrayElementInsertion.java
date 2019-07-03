/**
 * 
 */
package javaDay10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Ask user for array lengh
 * Ask for array elements
 * Ask where he wants to insert the element
 * ask for the value
 */
public class ArrayElementInsertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
		int length = scan.nextInt();
		
		int[] array = new int[length+1];
		System.out.println("Please enter the sorted array elements: ");
		for(int i=0; i<length;i++) {
			array[i] = scan.nextInt();
		}
		//System.out.println(Arrays.toString(array));
		//System.out.println("Please enter the index where do you want to inert an element: ");
		//int index = scan.nextInt();
		int index = -1;
		
		System.out.println("Please enter the element you want to insert: ");
		int element = scan.nextInt();
		
		//first find the index to insert the element
		//check if element is bigger than last element
		if((array[array.length-2]<element)) {
			index = array.length-1;
		}else{
			//check compare all the elements to find the index where can we add he element
			for(int i = 0; i<array.length-1;i++) {
				if((array[i]<element)&&(array[i+1]>element)) {
					index = i+1;
				}
			}
		}
		//as element is smaller than all the elements we need to place element at the start
		if(index== -1 && element<array[0]){
			index = 0;
		}		

		System.out.println("index is: " + index);
		//shift elements to right to make a space to add new elements
		for(int i = array.length-1;i>index;i--) {
			array[i] = array[i-1]; 
		}
		//put the new element to the index position entered by user
		array[index]=element;
		System.out.println(Arrays.toString(array));
		
		scan.close();
	}

}
