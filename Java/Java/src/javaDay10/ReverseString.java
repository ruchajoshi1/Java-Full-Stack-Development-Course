/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * program to reverse the string 
 * there are different ways to do that
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//there are different ways to reverse the given string
		
		//1. using CharArray - needs another array
		//code to reverse the string.
		String arr1 = "I have a dream";
		
		char[] charArray = arr1.toCharArray();
			
		System.out.println(charArray);
		System.out.println(Arrays.toString(charArray));
				
		//for loop to reverse the array in place. run the loop till length/2
		for(int i=0, j=charArray.length-1; i<charArray.length/2; i++, j--) {
			char temp = charArray[j];
			charArray[j] = charArray[i];
			charArray[i] = temp;
			//System.out.println("charArray[i]: " + charArray[i] + " charArray[j]: " + charArray[j]);
		}	
			System.out.println(charArray);
			
		//string reverse in place - strings are immutable, once declared and 
		//initialized we can not change it.
			//System.out.println("old arr1: " + arr1);
			//arr1 = "I want to change the string";
			//System.out.println("new arr1: " + arr1);
			//Almost every method, applied to a String object in order to modify it, 
			//creates new String object. 
		/*
		 * As applications grow, it's very common for String literals to occupy large area of memory,
		 * which can even cause redundancy. So, in order to make Java more efficient, the JVM sets aside
		 * a special area of memory called the "String constant pool". 
		 * When the compiler sees a String literal, it looks for the String in the pool. If a match is 
		 * found, the reference to the new literal is directed to the existing String and no new String 
		 * object is created. The existing String simply has one more reference. Here comes the point of
		 * making String objects immutable:
		 * In the String constant pool, a String object is likely to have one or many references. 
		 * If several references point to same String without even knowing it, it would be bad if one of 
		 * the references modified that String value. That's why String objects are immutable.
		 * Well, now you could say, what if someone overrides the functionality of String class? 
		 * That's the reason that the String class is marked final so that nobody can override the 
		 * behavior of its methods.
		 */
			
		//2. String reverse using StringBuilder
		
			StringBuilder input = new StringBuilder(arr1);
			
			/*
			for(int i=input.length()-1;i>0;i--) {
				append(input.chatAt[i]);
			}
			
			input.setCharAt(2, "A");
			*/
			
			//append a string into StringBuilder input
			//input.append(arr1);
			
			//reverse the StringBuilder Input
			input = input.reverse();
			//StringBuilder is mutable and hence changes its value.
			
			//Print reversed string
			System.out.println("String Builder: " + input);
			
			/*
			 * StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread 
			 * safe, i.e., multiple threads can use it without any issue. The thread safety brings a 
			 * penalty of performance.
			 * When to use which one : 
			 * If a string is going to remain constant throughout the program, then use String class 
			 * object because a String object is immutable.
			 * If a string can change (example: lots of logic and operations in the construction of the 
			 * string) and will only be accessed from a single thread, using a StringBuilder is good 
			 * enough.
			 * If a string can change, and will be accessed from multiple threads, use a StringBuffer 
			 * because StringBuffer is synchronous so you have thread-safety.
			 */
			
	}
}
