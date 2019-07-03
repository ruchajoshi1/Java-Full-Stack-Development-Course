package fileReadWrite_HandsOn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Reader {

	public static HashMap<String, String> fileReader(String location) {
		
		HashMap<String, String> credentials = new HashMap<String, String>();
		try {
			File file = new File(location);
			Scanner input = new Scanner(file);
			input.nextLine();//to skip header line before creating employee object
			String line;
			while(input.hasNextLine()) {
				line = input.nextLine();
				//if we have empty line in the input file then check first
				if(!line.equals("")) {			
				//String[] lineArr = input.nextLine.split(",");
				String[] lineArr = line.split(",");
				credentials.put(lineArr[0],lineArr[1]);
				}			
			}
			input.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		return credentials;
		
	}
}
