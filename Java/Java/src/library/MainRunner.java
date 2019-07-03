/**
 * 
 */
package library;

import java.util.ArrayList;
import java.util.List;
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
		
		//create book objects
		Books b1 = new Books(1,"Book1","abcd");
		Books b2 = new Books(2,"Book2","abcd");
		Books b3 = new Books(3,"Book3","abcd");
		Books b4 = new Books(4,"Book4","abcd");
		
		//create an array list for books created above
		List<Books> bookList = new ArrayList<Books>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		
		//creating a book list for an author
		List<Books> abc_bookList = new ArrayList<Books>();
		abc_bookList.add(b1);
		abc_bookList.add(b2);
		
		//create an author object
		Authors abc = new Authors(1,"abc",abc_bookList);
		
		List<Books> def_bookList = new ArrayList<Books>();
		def_bookList.add(b2);
		def_bookList.add(b3);
		
		//create another author object
		Authors def = new Authors(2,"def",def_bookList);
		
		List<Books> lmn_bookList = new ArrayList<Books>();
		lmn_bookList.add(b3);
		lmn_bookList.add(b4);
		
		//create another author object
		Authors lmn = new Authors(3,"lmn",lmn_bookList);
		
		//create a list of authors
		List<Authors> authorList = new ArrayList<Authors>();
		authorList.add(abc);
		authorList.add(def);
		authorList.add(lmn);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the author name you would like to see: ");
		String author = scan.nextLine();
		
		//System.out.println("Scanner input: "+ author);
		
		
		//print author information
		//print the author information
		
			boolean authorFound = false;
			/*for(Authors au: authorList) {
				System.out.println(au.authorName);
			}*/
			for(int i = 0; i<authorList.size();i++) {
				if(authorList.get(i).authorName.equals(author)) {
					Authors foundAuthor = authorList.get(i);
					System.out.println(authorList.get(i).authorId);
					System.out.println(authorList.get(i).authorName);
					for(Books b:authorList.get(i).authorBooks) {
						System.out.println(b.bookName);
					}
					//next user input
					
					System.out.println("Which book do you want to remove?");
					String bookName = scan.nextLine();
					
					foundAuthor.removeBook(bookName);
					foundAuthor.printAuthor();

					
					System.out.println("Which book would you like to add to the author's list?");
					String newBookName = scan.nextLine();
					
					foundAuthor.addBook(newBookName,bookList);
					foundAuthor.printAuthor();
					
					authorFound = true;
				}
			}
			if(!authorFound) {
				System.out.println(author + " - could not find the author.");
			}
		
		scan.close();
	}

}
