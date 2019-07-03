package fileReadWrite_HandsOn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public static void fileWriter(String username, String location, String userline) {
		try {
			File file = new File(location);
			FileWriter writer = new FileWriter(file, true);
			writer.write(username + " : " + userline + "\n");
			writer.close();
		}catch(IOException e) {
			System.out.println("File not found.");
		}
	}

}
