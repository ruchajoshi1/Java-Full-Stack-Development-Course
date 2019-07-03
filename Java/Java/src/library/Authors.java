package library;

//import java.util.ArrayList;
import java.util.List;

public class Authors {
	
	 int authorId;
	 String authorName;
	 List<Books> authorBooks;
	
	Authors(int authorid, String authorname, List<Books> authorbooks){
		authorId = authorid;
		authorName = authorname;
		authorBooks = authorbooks;
	}
	
	//print the author information
		public void printAuthor() {
				System.out.println(authorId);
				System.out.println(authorName);
				for(Books b:authorBooks) {
						System.out.println(b.bookName);
				}					
		}
	
	//method to remove a book from author's book list
		public void removeBook(String bookName) {
		boolean removed = false;
		for(int i = 0; i <authorBooks.size();i++) {
			if(authorBooks.get(i).bookName.equals(bookName)) {
				authorBooks.remove(authorBooks.get(i));
				removed = true;
			}
		}
		if(removed) {
			System.out.println(bookName + " - removed succesfully.");
		}else {
			System.out.println(bookName + " - is not present in the list.");
		}
	}
	
 	//method to add a book to author's book list
		public void addBook(String newBookName, List<Books> bookList) {
		boolean found = false;
		for(int i = 0;i<authorBooks.size();i++) {
			if(authorBooks.get(i).bookName.equals(newBookName)) {
				found = true;
			}
		}
		if(found) {
			System.out.println(newBookName + " - is already present in the list");
		}
		else {
			for(int j = 0; j<bookList.size(); j++) {
				if(bookList.get(j).bookName.equals(newBookName)) {
					authorBooks.add(bookList.get(j));
					System.out.println(newBookName + " - added succesfully.");
					break;
				}
			}
		}
	}

}
