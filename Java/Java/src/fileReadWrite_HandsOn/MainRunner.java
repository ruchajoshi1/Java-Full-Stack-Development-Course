/**
 * 
 */
package fileReadWrite_HandsOn;

//import java.util.ArrayList;
import java.util.HashMap;

//import java.util.Map;
import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read credentials file
		String location = "D:\\Users\\rucha.joshi\\eclipse-workspace\\Java\\src\\fileReadWrite_HandsOn\\Credentials.txt";
		
		HashMap<String, String> credentials = Reader.fileReader(location);
		
		Scanner scan = new Scanner(System.in);
		
		boolean found = false;
		int counter = 0;
		
		System.out.println("What is your Username?");
		String username = scan.nextLine();
		
		if(credentials.containsKey(username)) {
			System.out.println("username matched");
			while(counter<3) {
			System.out.println("What is your password?");
			String password = scan.nextLine();
				if (credentials.get(username).equals(password)) {
					//System.out.println("password matched");
					found = true;
					break;
				}else {
					System.out.println("password not matched");
					counter++;
				}
			}
		}
		
		/*
		//printing file
		for(Map.Entry<String, String> entry: credentials.entrySet()) {
			//System.out.println(entry.getKey() + " : " + entry.getValue());
			if(entry.getKey().equals(username) && entry.getValue().equals(password)) {
				found = true;
			} 
		}
		*/
		if(found) {
			System.out.println("What do you want to post?");
			String userline = scan.nextLine();
			//System.out.println("userline: " + userline);
			String writeLocation = "D:\\Users\\rucha.joshi\\eclipse-workspace\\Java\\src\\fileReadWrite_HandsOn\\MyBlog.txt";
			Writer.fileWriter(username,writeLocation,userline);
		} else {
			System.out.println("Credentials not matched");
		}
		
		
		/*int count = 0;
		
		if (credentials.containsKey(username)) {
			//while(count<3) {
				
			//check user name in credentials file if matched ask for password
			
						
			if(credentials.containsValue(password)) {
				//if matched ask to post in the blog
				
				//break;
			} else {
				System.out.println("password not matched");
				count++;				
			}
			//}			
		}else {
			System.out.println("Username did not match.");
		}
		*/
		scan.close();
		//if false ask 3 times
		//if false exit
		
		//input line
		//write line to MyBlog file

	}

}
