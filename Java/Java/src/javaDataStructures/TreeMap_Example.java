/**
 * 
 */
package javaDataStructures;

import java.util.Collections;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author rucha.joshi
 *
 */
public class TreeMap_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//treemap - navigator map
		
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();
		tmap1.put(1,"NY");
		tmap1.put(2,"NJ");
		tmap1.put(3,"CA");
		tmap1.put(3,"PA");
		//tmap1.put(null,"MI"); can not have a null key 
		tmap1.put(4,null);
		
		/*
		 * System.out.println("Tree Map : - "); // another way to print key and value
		 * for(Map.Entry<Integer, String> entry: tmap1.entrySet()) {
		 * System.out.println("Key = " + entry.getKey() + " Value = " +
		 * entry.getValue()); }
		 */
		
		//tmap 2
		TreeMap<Integer, String> tmap2 = new TreeMap<Integer, String>();
		tmap2.put(999,"PQ");
		tmap2.put(1000,"QR");
		
		//adding map into map
		tmap1.putAll(tmap2);
		
		tmap1.put(201,"CD");
		
		// another way to print key and value - sorted output ascending order
				for(Map.Entry<Integer, String> entry: tmap1.entrySet()) {
					System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
				}
			
		// create a new map to get sorted  a tree map in descending order
		Map<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
		newMap.putAll(tmap1);
		
		System.out.println("Reversed Tree map ---------------- ");
		for(Map.Entry<Integer, String> entry: newMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}

	}

}
