/**
 * 
 */
package javaDataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author rucha.joshi
 *
 */
public class LinkedHashMapAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generic hash map using only integer and string
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>(); 
		
		hmap1.put(1,"NY");
		hmap1.put(2,"NJ");
		hmap1.put(3,"CA");
		hmap1.put(3,"PA");
		hmap1.put(null,"MI");
		hmap1.put(4,null);
		
		// 1 way to print key and value
		System.out.println(hmap1.keySet());
		System.out.println(hmap1.values());
		
				
		System.out.println(hmap1.containsValue("NY")); //true - search in hash map
		System.out.println(hmap1.containsKey(null));//true  - search in hash map
		System.out.println(hmap1.get(3));//PA
		System.out.println(hmap1.replace(2, "XY"));//replace NJ with XY
					
		System.out.println(hmap1.remove(2));//remove 2 from map
		System.out.println(hmap1.get(3).hashCode());//prints hash code - 2545
		
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(999, "PQ");
		hmap2.put(990, "AB");
		
		hmap1.putAll(hmap2);
		hmap2.putAll(hmap1);
		
		// another way to print key and value
		for(Map.Entry<Integer, String> entry: hmap1.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		// 1 way to print key and value
		System.out.println(hmap2.keySet());
		System.out.println(hmap2.values());
		
		//linked hash map - 1 - keeps insertion order
		LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<Integer, String>();
		lmap1.put(1,"NY");
		lmap1.put(2,"NJ");
		lmap1.put(3,"CA");
		lmap1.put(3,"PA");
		lmap1.put(null,"MI");
		lmap1.put(4,null);
		
		System.out.println("LinkedhashMap : - ");
		// another way to print key and value
				for(Map.Entry<Integer, String> entry: lmap1.entrySet()) {
					System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
				}
		
		//lmap 2
		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<Integer, String>();
		lmap2.put(999,"PQ");
		lmap2.put(1000,"QR");
		
		//adding map into map
		lmap1.putAll(lmap2);
		
		lmap1.put(201,"CD");
		
		// another way to print key and value
				for(Map.Entry<Integer, String> entry: lmap1.entrySet()) {
					System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
				}
		
		System.out.println("Linked Hash Map - access order");
		System.out.println("--------------------------------------------------------");
		//linked hash map - 1 - keeps access order
		LinkedHashMap<Integer, String> lmap1Access = new LinkedHashMap<Integer, String>(16,0.75f, true);
		lmap1Access.put(1,"NY");
		lmap1Access.put(2,"NJ");
		lmap1Access.put(3,"CA");
		lmap1Access.put(3,"PA");
		lmap1Access.put(null,"MI");
		lmap1Access.put(4,null);
		
		/*
		 * System.out.println("LinkedhashMap : - "); // another way to print key and
		 * value for(Map.Entry<Integer, String> entry: lmap1Access.entrySet()) {
		 * System.out.println("Key = " + entry.getKey() + " Value = " +
		 * entry.getValue()); }
		 */
		
		//lmap 2
		LinkedHashMap<Integer, String> lmap2Access = new LinkedHashMap<Integer, String>();
		lmap2Access.put(999,"PQ");
		lmap2Access.put(1000,"QR");
		
		//adding map into map
		lmap1Access.putAll(lmap2Access);
		
		lmap1Access.put(201,"CD");
		
		System.out.println(lmap1Access.putIfAbsent(201, "AB"));
		
		lmap1Access.get(1);
		lmap1Access.get(2);
		lmap1Access.get(1);
		
		// another way to print key and value
				for(Map.Entry<Integer, String> entry: lmap1Access.entrySet()) {
					System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
				}
		
	}

}
