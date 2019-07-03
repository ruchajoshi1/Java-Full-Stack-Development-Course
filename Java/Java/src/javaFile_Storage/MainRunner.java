/**
 * 
 */
package javaFile_Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	//public static void main(String[] args) throws FileNotFoundException{
	// there two ways of handling exception 1. using try and catch 
	// 2. write throws FileNotFoundException at main method header
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "D:\\Users\\rucha.joshi\\eclipse-workspace\\Java\\src\\javaFile_Storage\\test.txt";
	
		ArrayList<Employee> empList = MyFileReader.fileReader(location);//calling method from MyFileReader
		
				
		Employee emp1 = new Employee(300, "Tom", "San Jose");
		Employee emp2 = new Employee(400, "David", "San Jose");
		Employee emp3 = new Employee(500, "Kevin", "San Jose");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		//print empList object
		//System.out.println(data);
		for(Employee emp:empList) {
			//System.out.println(line);
				/*
				 * for(String token: line) { //System.out.println(token); System.out.print(token
				 * + " | "); } System.out.println();
				 */
			System.out.println(emp.toString());
		}
		
		MyFileWriter.fileWriter(location, empList);
		
		//MyFileWriter.fileWriter(location, empList);
	
		
	}

}
