/**
 * 
 */
package javaDay10;
// java.util.Arrays;
import java.util.Scanner;
/**
 * @author rucha.joshi
 * Play a tic-tac-toe game with 2 players
 */

public class TicTacToe {

	/**
	 * @param args
	 */
	//method to print a tic-tac-toe table
	//input is an array for table and no output
	public static void printTable(char[][] array) {
		System.out.println("Tic-Tac-Toe Board: ");
		for(int i = 0;i<array.length;i++) {
			for(int j = 0; j<array[i].length;j++) {
				if (j<array[i].length-1) {
				System.out.print(" " + array[i][j] + " " + "|");
				}else {
					System.out.print(" " + array[i][j] + " ");
				}
			}
			System.out.println();
			if(i<array.length-1) {
			System.out.println("-----------");
			}
		}
	}
	//method to get user input and update an array for the board
	public static void userInput(char[][] array, Scanner scan, int user) {
			int input = scan.nextInt();
			int x = input / 10;
			int y = input % 10;
			if(user == 1) {
				array[x][y] = 'X';				
			} else if(user==2) {
				array[x][y] = 'O';
			}
				
		printTable(array);
	}
	//method to check the winner
	public static Boolean winner(char[][] array){
	    boolean b1 = (array[0][0] == array [0][1]) && (array[0][0] == array [0][2]) && array[0][0]!=' ';
	    boolean b2 = (array[0][0] == array [1][1]) && (array[0][0] == array [2][2]) && array[0][0]!=' ';
	    boolean b3 = (array[0][0] == array [1][0]) && (array[0][0] == array [2][0]) && array[0][0]!=' ';
	    boolean b4 = (array[0][2] == array [1][2]) && (array[0][2] == array [2][2]) && array[0][2]!=' ';
	    boolean b5 = (array[0][1] == array [1][1]) && (array[0][1] == array [2][1]) && array[0][1]!=' ';
	    boolean b6 = (array[2][0] == array [2][1]) && (array[2][0] == array [2][2]) && array[2][0]!=' ';
	    boolean b7 = (array[2][0] == array [1][1]) && (array[2][0] == array [0][2]) && array[2][0]!=' ';	    	   
	    boolean b8 = (array[1][0] == array [1][1]) && (array[1][0] == array [1][2]) && array[1][0]!=' ';
	    /*
	    System.out.println("b1:" + b1);
	    System.out.println("b2:" + b2);
	    System.out.println("b3:" + b3);
	    System.out.println("b4:" + b4);
	    System.out.println("b5:" + b5);
	    System.out.println("b6:" + b6);
	    System.out.println("b7:" + b7);
	    System.out.println("b8:" + b8);
	    */
	    return (b1 || b2 || b3 || b4 || b5 || b6 || b7 ||b8); 
		/*
		return ((array[0][0] == array [0][1]) && (array[0][0] == array [0][2])) ||
	    	   ((array[0][0] == array [1][1]) && (array[0][0] == array [2][2])) ||
	    	   ((array[0][0] == array [1][0]) && (array[0][0] == array [2][0])) ||
	    	   ((array[0][2] == array [1][2]) && (array[0][2] == array [2][2])) ||
	    	   ((array[0][1] == array [1][1]) && (array[0][1] == array [2][1])) ||
	    	   ((array[2][0] == array [2][1]) && (array[2][0] == array [2][2])) ||
	    	   ((array[2][0] == array [1][1]) && (array[2][0] == array [0][2])) ||	    	   
	    	   ((array[1][0] == array [1][1]) && (array[1][0] == array [1][2]));
	    	  */
	}
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3;
		int columns = 3;
		char[][] array = new char[rows][columns];
		
		//initialize array with spaces		
		for(int i = 0;i<rows;i++) {
			for(int j = 0; j<columns;j++) {
				array[i][j] = ' ';				
			}
		}
		
		Scanner scan = new Scanner(System.in);
		printTable(array);
		
		//ask user1 and user 2 to play the game
		for(int i = 0;i<5;i++) {
			System.out.println("Player1 : Please enter the position where you want to add 'X': ");
			userInput(array,scan,1);
			//check for the winner 
			if(i>1) {
				if(winner(array)) {
					System.out.println("Player 1 is a winner.");
					break;
				}
			}						
			//if i = 4 then board is complete so don't ask user 2 
			if(i<4) {				
				System.out.println("Player2 : Please enter the position where you want to add 'O': ");
				userInput(array,scan,2);
				//check for the winner 
				if(i>1) {
					if(winner(array)) {
						System.out.println("Player 2 is a winner.");
						break;
					}
				}
			}			
		}
		if(!winner(array)) {
			System.out.println("Game is over!");
		}
		System.out.println("Thank you for playing!!");
		//find the winner
		scan.close();
	}

}
