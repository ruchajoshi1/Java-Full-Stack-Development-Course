package javaDataStructures;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map m1 = new HashMap<>();
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1,"Mango");
		m1.put(2,"Orange");
		m1.put(3,"Orangex");//this one is not printed
		m1.put(3,"Bananax");//this one is not printed
		m1.put(3,"Banana");
		
		System.out.println(m1.keySet());//prints unique keys. [1, 2, 3]
		System.out.println(m1.values());//prints unique values. [Mango, Orange, Banana]
		
	}

}
