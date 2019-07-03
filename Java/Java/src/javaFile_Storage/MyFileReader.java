package javaFile_Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

	public static ArrayList<Employee> fileReader(String location) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		try {
			
			File file = new File(location);
			Scanner input = new Scanner(file);//scanner to read file
			//String line = input.nextLine();//reads line by line from the file
			//String data = "";
			//ArrayList<String> data = new ArrayList<String>();
			//ArrayList<String[]> data = new ArrayList<String[]>();
			 
			input.nextLine();//to skip header line before creating employee object
			String line;
			while(input.hasNextLine()) {
				//data += input.nextLine();
				//data.add(input.nextLine());
				//String line = input.nextLine();//reads line by line from the file
				//data.add(line.split(","));
				
				line = input.nextLine();
				//if we have empty line in the input file then check first
				if(!line.equals("")) {			
				//String[] lineArr = input.nextLine.split(",");
				String[] lineArr = line.split(",");
				employeeList.add(new Employee(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2]));
				}
			}
			
			input.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		} catch(NumberFormatException e) {
			//if ID is not an integer 
			System.out.println("Please check the ID format in the file!");
		}
		
		return employeeList;
	}
}
