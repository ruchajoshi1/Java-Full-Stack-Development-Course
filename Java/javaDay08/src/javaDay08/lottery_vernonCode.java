package javaDay08;

import java.util.Random;
import java.util.Scanner;

public class lottery_vernonCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generate a random two digit number
		// get input from the user - get the match
		
		Random r1 = new Random();
		int lottery = r1.nextInt(90)+10;
		int lottery1 = lottery/10;   //first digit
		int lottery2 = lottery % 10; //last digit
		int userinput = 0;
		Scanner input = new Scanner(System.in); //get user input

		while(userinput < 10 || userinput >=100) {   //make sure it is between 10 and 99
			System.out.println("Please enter a two digit number:");
			userinput = input.nextInt();
		}
		
		int user1 = userinput/10; // first digit
		int user2 = userinput%10; // second digit
		System.out.println("The lottery number is "+lottery);
		System.out.println("Your number is "+userinput);
		if (user1==lottery1 && user2==lottery2) {
			//we have a winner!
			System.out.println("Congratulations! You matched exactly and won $10,000!");
		}else if (user1==lottery2 && user2 == lottery1) {
			//we have a second prize
			System.out.println("Congratulations! You matched both numbers andwon $3,000!");
		}else if(user1==lottery1 || user1==lottery2 || user2 == lottery2 || user2 == lottery1) {
			//we have a third prize and lots of or statements 
			System.out.println("Congratulations! You matched one number and won $1,000!");
		}else {
			//sorry you did not win
			System.out.println("Sorry! You did not win.");
		}

		input.close(); //close the scanner  - remember to do this!
		
	}

}
