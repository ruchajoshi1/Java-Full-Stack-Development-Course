/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * The problem is to write a program that picks four cards randomly from a deck of 52 cards. 
 * All the cards can be represented using an array named deck, filled with initial values 0 to 51
 */
public class Slide41_DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] group = {"Spades","Hearts","Diamonds","Clubs"};
		String[] name = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int[] pick = new int[4];
		String type="";
		String reminder;
		//create an array of 52 cards.
		int[] deck = new int[52];
		
		for(int i =0; i<deck.length; i++) {
			deck[i] = i;
		}
		
		System.out.println(Arrays.toString(deck));
		
		//random shuffling of 52 cards
		
		for(int i=deck.length-1;i>0;i--) {
			int j = (int)(Math.random()*(i+1));
			
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
		System.out.println(Arrays.toString(deck));
		
		/* better way of doing using 2 arrays
		for(int i=0;i<4;i++) {
			pick[i] = deck[i];
			type = group[deck[i]/13]; //this will give value between 0 to 3
			reminder = name[pick[i] % 13]; // use name array
			System.out.println("Card number is " + pick[i] + " : " + reminder + " of " + type);
		} */
		
		for(int i=0;i<4;i++) {
			pick[i] = deck[i];
			if (pick[i]<12) {
				type="Spades";
			}else if(pick[i]>12&&pick[i]<26) {
				type="Hearts";
			}else if(pick[i]>25&&pick[i]<39) {
				type="Diamonds";
			}else if (pick[i]>38) {
				type="Clubs";
			}
			reminder = name[pick[i] % 13];
			System.out.println("Card number is " + pick[i] + " : " + reminder + " of " + type);
		}
	}

}
