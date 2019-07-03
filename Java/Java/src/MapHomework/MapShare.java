/**
 * 
 */
package MapHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to 
 * have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapShare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean stop = true;
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		Scanner scan = new Scanner(System.in);
		
		while(stop) {
			
			System.out.println("Please enter a key value as a,b,c.. - ");
			String key = scan.next();
			
			System.out.println("Please enter a value for a key - ");
			String value = scan.next();
			
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
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		if(map1.containsKey("a")) {
			map1.put("b",map1.get("a"));			
		}
		
		if(map1.containsKey("c")) {
			map1.remove("c");
		}
		//print new changed map
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		scan.close();

	}

}
