package javaDataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTest {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
	 long startTime = 0;
	 long endTime = 0;

	 // Array
	 // Add
	 startTime = System.nanoTime();
	 int[] numbers = new int[1000000];
	 for (Integer i = 0; i < numbers.length; i++) {
	 numbers[i] = i;
	 }
	 endTime = System.nanoTime();
	 System.out.println("Initialization Duration Array: " + (endTime - startTime));

	 // Seq Access
	 startTime = System.nanoTime();
	 for (int i = 0; i < numbers.length; i++) {
	 }
	 endTime = System.nanoTime();
	 System.out.println("Seq Access Duration Array: " + (endTime - startTime));

	 // Rand Access
	 startTime = System.nanoTime();
	 int num = numbers[500000];
	 endTime = System.nanoTime();
	 System.out.println("Random Access Duration Array for: " + num + " is " + (endTime - startTime));
	 System.out.println("=======================================================");

	 // ArrayList
	 // Add
	 startTime = System.nanoTime();
	 ArrayList<Integer> numList = new ArrayList<Integer>();
	 for (int i = 0; i < 1000000; i++) {
	 numList.add(i);
	 }
	 endTime = System.nanoTime();
	 System.out.println("Initialization Duration ArrayList: " + (endTime - startTime));
	 
	// Seq Access
	 startTime = System.nanoTime();
	 for (int i = 0; i < numList.size(); i++) {
	 }
	 endTime = System.nanoTime();
	 System.out.println("Seq Access Duration Array: " + (endTime - startTime));

	 // Rand Access
	 startTime = System.nanoTime();
	 int index = numList.get(500000);
	 endTime = System.nanoTime();
	 System.out.println("Random Access Duration Array for: " + index + " is " + (endTime - startTime));
	 System.out.println("=======================================================");

	 // LinkedList
	 // Add
	 startTime = System.nanoTime();
	 LinkedList<Integer> numLL = new LinkedList<Integer>();
	 for (int i = 0; i < 1000000; i++) {
	 numLL.add(i);
	 }
	 endTime = System.nanoTime();
	 System.out.println("Initialization Duration LinkedList: " + (endTime - startTime));

	 // Seq Access
	 startTime = System.nanoTime();
	 for (int i = 0; i < numLL.size(); i++) {
	 }
	 endTime = System.nanoTime();
	 System.out.println("Seq Access Duration LL: " + (endTime - startTime));
	 
	 // Rand Access
	 startTime = System.nanoTime();
	 int index2 = numLL.get(500000);
	 endTime = System.nanoTime();
	 System.out.println("Random Access Duration LL for: " + index2 + " is " + (endTime - startTime));
	}

}
