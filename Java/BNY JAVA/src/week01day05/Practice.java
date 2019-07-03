package week01day05;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// examples of string class and its methods
		
		String ch = "Hello";
		String ch1 = "New word";
		
		System.out.println(ch.length());
		System.out.println(ch.concat(ch1));
		System.out.println(ch1.charAt(5));
		
		//example of character class and its method
		if(Character.isDigit('9')) {
			System.out.println("It is a digit.");
		}
		else {
			System.out.println("It is not a digit.");
		}
		
		//reading a string from a console
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		//String S1 = input.next();
		//String S2 = input.next();
		String S3 = input.nextLine();
		String S2 = input.next();
		
		//System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
	}

}
