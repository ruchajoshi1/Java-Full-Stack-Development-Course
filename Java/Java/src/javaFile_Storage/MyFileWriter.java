package javaFile_Storage;
import java.util.ArrayList;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class MyFileWriter {
	public static void fileWriter(String location, ArrayList<Employee> empList) {
		
		try {
		File file = new File(location);
		FileWriter writer = new FileWriter(file, false);//overwriting existing file 
		//writer.write("\n I am a new employee.");
		
		writer.write("ID, Name, City \n");
		
		for(Employee emp:empList) {
			writer.write(emp.geteId()+ "," + emp.geteName() + "," + emp.geteCity() + "\n");
		}
		writer.close();
		
		} catch(IOException e) {
			System.out.println("File not found!");
		}
	}

}
