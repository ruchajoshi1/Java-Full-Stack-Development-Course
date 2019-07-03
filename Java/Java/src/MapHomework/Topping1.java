/**
 * 
 */
package MapHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Given a map of food keys and toppings values, modify and return the map as follows: 
 * if the key "ice cream" is present, set its value to "cherry". In all cases, set the 
 * key "bread" to have the value "butter".
 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 * topping1({}) → {"bread": "butter"}
 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 *
 */
public abstract class Topping1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		Scanner scan = new Scanner(System.in);
		
		while(stop) {
			
			System.out.println("Please enter a food key - ");
			String key = scan.nextLine();
			
			System.out.println("Please enter a topping value - ");
			String value = scan.nextLine();
			
			map1.put(key,value);
			
			System.out.println("Would you like to add another key-value? Please enter Y or N ");
			String answer = scan.next();
			
			//System.out.println("answer: " + answer);
			if(answer.equals("N")) {
				//System.out.println("Inside if");
				stop = false;
			}		
		}
		
		//print original map
		System.out.println("Original map - ");
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		map1.put("bread","butter");
		
		if(map1.containsKey("ice cream")) {
			map1.put("ice cream","cherry");			
		}
		
		
		
		//print new changed map
		System.out.println("Modified map - ");
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		scan.close();

	}

}
