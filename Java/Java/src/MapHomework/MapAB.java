/**
 * 
 */
package MapHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rucha.joshi
 * Modify and return the given map as follows: for this problem the map may or may not contain 
 * the "a" and "b" keys. If both keys are present, append their 2 string values together and 
 * store the result under the key "ab".
 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */
public class MapAB {

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
			
			if(answer.equals("N")) {
				stop = false;
			}		
		}
		
		//print original map
		System.out.println("Original map - ");
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		String temp;
		if(map1.containsKey("a")&& map1.containsKey("b")) {
			temp = map1.get("a") + map1.get("b");
			map1.put("ab",temp);
			//map1.get("ab").addAll(map1.get("b"));
		}
		
		//print new changed map
		System.out.println("modified map - ");
		for(Map.Entry<String, String> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		scan.close();
	}

}
