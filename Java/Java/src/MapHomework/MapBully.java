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
 * have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking 
 * the value and replacing it with the empty string.
 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 *
 */
public class MapBully {

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
			map1.put("a", "");
		}
		
		//print new changed map
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		scan.close();

	}

}
