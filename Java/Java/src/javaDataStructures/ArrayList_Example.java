/**
 * 
 */
package javaDataStructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.*  - this will include all the libraries

/**
 * @author rucha.joshi
 * example for array list
 */
public class ArrayList_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array list
		List<Integer> xyz = new ArrayList<Integer>();//restricted to take integer data
		//generic list to take only integers	
		xyz.add(1);
		
		List def = new ArrayList();//restricted to take integer data
		//non generic list	- mixed data type elements	
		def.add("Mango");
		def.add(10);
		
		System.out.println(xyz);
		System.out.println(def);//it maintains order of insertion
		System.out.println(def.size());
		
		List<String> abc = new ArrayList<String>();//restricted to take integer data
		//generic list	 - String	
		abc.add("Vernon");
		abc.add("Lucy");
		abc.add("Lucy");//takes duplicate
		abc.remove("Lucy");//will remove Lucy at first position
		abc.add(0,"Nilda");//add Nilda at 0 index
		abc.add(1,"Shahparan");//add shahparan at 1 index
		abc.add(1,"Shahparan");//adding duplicate
		System.out.println(abc);
		System.out.println(abc.get(0));//get element at index 0
		System.out.println(abc.indexOf("Nilda"));//get index of Nilda as 0
		System.out.println(abc.contains("Shahparan"));//gives true - case sensitive
		System.out.println(abc.lastIndexOf("Shahparan"));//gives last index of duplicate as 2
		abc.set(1, "Marcial");//replace Shahparan at index with Marcial
		System.out.println(abc);//[Nilda, Marcial, Shahparan, Vernon, Lucy]
		
		//List to array conversion
		String[] arr = new String[abc.size()];//length size of list or more not less
		abc.toArray(arr);//convert list to array
		System.out.println(Arrays.toString(arr));
		
		//Array to List conversion
		List<String> newList = new ArrayList<>();
		newList = Arrays.asList(arr);
		System.out.println("Array to List: " + newList);
		
		//List is only for objects
		//int[] numbers = {1,2,3,4,5};//int is premitive
		Integer[] numbers = {1,2,3,4,5}; // Integer is wrapper class
		List<Integer> numList = new ArrayList<>();
		//numList = Arrays.asList(numbers); - as int is a premitive data type is not used in List
		numList = Arrays.asList(numbers);
		
		int x = 5; //Primitive
		Integer y = 6;//Wrapper Class
		
		//remove all element
		def.clear();
		System.out.println(def);
		
		//similar to for loop o do iterations in Array list  - to print all the elements
		//Lamda expression
		abc.forEach(p -> {System.out.println(p);});
		
		List<String> ins = new ArrayList<>();
		ins.add("Shah");
		ins.add("Young");
		
		abc.addAll(ins);// adds all elements from ins to abc - concatenate
		System.out.println(abc);
		
		//generic but can add all types of object 
		List<Object> rIT = new ArrayList<>();//type of list is an object
		rIT.add(2);
		rIT.add("String");
	}

}
