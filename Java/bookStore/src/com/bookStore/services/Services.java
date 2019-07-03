package com.bookStore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookStore.entities.Book;
import com.bookStore.entities.Customer;

public class Services implements BookStoreDAO {
		
	//scanner to ask inputs from user
	Scanner scan = new Scanner(System.in);
		
	public void addCustomer() {
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//create an customer object
		Customer customer = new Customer();
		
		System.out.println("Please enter customer name: ");
		String name = scan.nextLine();
		
		customer.setName(name);	
		
		System.out.println("Would you like to add any book? Below is the avaialable book list: ");
		printAllBooks();
		System.out.println("Please enter the book Id: ");
		int bookId = scan.nextInt();
		scan.nextLine();		
		//perform your actions on database
		Book foundBook = entitymanager.find(Book.class, bookId);
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(foundBook);
		
		customer.setBookList(bookList);
		
		entitymanager.getTransaction().begin();
		//perform your actions on database
		entitymanager.persist(customer);
	
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();	
		System.out.println("Added a new Customer to the customer Table");
	}

	@Override
	public void addBook() {
		//create an book object
		Book book = new Book();
		
		System.out.println("Please enter book title: ");
		String bookTitle = scan.nextLine();
		System.out.println("Please enter book publish year: ");
		String publishYear = scan.nextLine();
		System.out.println("Please enter book author: ");
		String author = scan.nextLine();
		
		book.setBookTitle(bookTitle);
		book.setPublishYear(publishYear);
		book.setAuthor(author);
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		//perform your actions on database
		entitymanager.persist(book);
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();
		System.out.println("Added a new book to the book Table");
	}

	@Override
	public void updateCustomerTable() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		
		System.out.println("Which customer would you like to update? Find the list of customers below: ");
		printAllCustomers();
		
		System.out.println("Please enter the customer Id you would like to update: ");
		int customerId = scan.nextInt();
		scan.nextLine();
		Customer foundCustomer = entitymanager.find(Customer.class, customerId);
		
		boolean flag = true;
		if(foundCustomer != null) {
			//ArrayList<Book> customerBookList = (ArrayList<Book>) foundCustomer.getBookList();
			while(flag) {
				List<Book> customerBookList = foundCustomer.getBookList();
				System.out.println("What would you like to update for the customer? Please select from the list below: ");
				System.out.println("1. Update name");
				System.out.println("2. Add a new book");
				System.out.println("3. Remove a book from the list");
				
				int option = scan.nextInt();
				scan.nextLine();
				switch(option) {
				case 1: System.out.println("Please enter the new name: ");
						String newName = scan.nextLine();
						foundCustomer.setName(newName);
						break;
				case 2: System.out.println("Please select the book you would like to add from the below list: ");
						printAllBooks();
						System.out.println("Please enter the book id you would like to add: ");
						int addBookId = scan.nextInt();
						scan.nextLine();
						Book addFoundBook = entitymanager.find(Book.class, addBookId);
						if(addFoundBook != null) {
							customerBookList.add(addFoundBook);
						}else {
							System.out.println("Book is not present in the book.");
						}
						break;
				case 3: System.out.println("Which book would you like to remove?");
						System.out.println("Below is the current book list: ");
						for(Book currentBooks:customerBookList) {
							currentBooks.printBook();
						}
						System.out.println("Please enter the book id you would like to remove: ");
						int removeBookId = scan.nextInt();
						scan.nextLine();
						Book removeFoundBook = entitymanager.find(Book.class, removeBookId);
						
						if(removeFoundBook != null) {
							customerBookList.remove(removeFoundBook);
						} 
						break;
				default: System.out.println("Sorry wrong option");
						 break;				
				}
				
				System.out.println("Would you like to update anything else? Please enter 'Y' or 'N' ");
				String input = scan.next();
				
				if(input.equalsIgnoreCase("N")) {
					System.out.println("thank you for updating the record.");
					flag = false;
				}
			}
		} else {
			System.out.println("Customer is not present in the list.");
		}
		
		
		//start a transaction if needed
		entitymanager.getTransaction().begin();		
		//perform your actions on database
		entitymanager.persist(foundCustomer);
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();
		System.out.println("Updated a Customer to the customer Table");
	}

	@Override
	public void updateBookTable() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		
		System.out.println("Which book would you like to update?");
		printAllBooks();
		System.out.println("Please enter the book id you would like to update: ");
		int bookId = scan.nextInt();		
		scan.nextLine();
		Book foundBook = entitymanager.find(Book.class, bookId);
		
		boolean flag = true;
		if(foundBook != null) {	
		
		while(flag) {
			System.out.println("What would you like to update for the book? Please select option from below:");
			System.out.println("1. Book Title");
			System.out.println("2. Book publish year");
			System.out.println("3. Book author");
			
			int option = scan.nextInt();
			scan.nextLine();
			entitymanager.getTransaction().begin();	
			
			switch (option) {
			case 1: System.out.println("Please enter new book title: ");
					String bookTitle = scan.nextLine();
					foundBook.setBookTitle(bookTitle);
					break;
			case 2: System.out.println("Please enter new book publish year:");
					String publishYear = scan.nextLine();
					foundBook.setPublishYear(publishYear);
					break;
			case 3: System.out.println("Please enter new author: ");
					String newAuthor = scan.nextLine();
					foundBook.setAuthor(newAuthor);
					break;
			default: System.out.println("Sorry wrong option.");
					 break;			
			}
			
			System.out.println("Would you like to update anything else? Please enter 'Y' or 'N'");
			String input = scan.next();
			if(input.equals("N")) {
				System.out.println("Thank you for updating.");
				flag = false;
			}
			//commit the transaction if needed
			entitymanager.getTransaction().commit();
		}
		} else {
			System.out.println("Book is not present in the list.");
		}
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();
		// TODO Auto-generated method stub
		System.out.println("Updated a Book to the book Table");
	}

	@Override
	public void removeCustomer() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		System.out.println("Please find the customer list: ");
		printAllCustomers();
		System.out.println("Which customer would you like to remove? Please enter the customer Id: ");
		int customerId = scan.nextInt();
		scan.nextLine();
		entitymanager.getTransaction().begin();		
		//perform your actions on database
		Customer foundCustomer = entitymanager.find(Customer.class, customerId);
		entitymanager.remove(foundCustomer);
		
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();
		System.out.println("Removed a Customer from the customer Table");
	}

	@Override
	public void removeBook() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		//start a transaction if needed
		System.out.println("Please find the book list: ");
		printAllBooks();
		System.out.println("Which book would you like to remove? Please enter the book Id: ");
		int bookId = scan.nextInt();
		scan.nextLine();
		
	  Query query = entitymanager.createQuery("SELECT c FROM Customer c");
	  
	  @SuppressWarnings("unchecked") List<Customer> customerList = query.getResultList(); 
	  
	  
		//perform your actions on database
		Book foundBook = entitymanager.find(Book.class, bookId);
	  
	  for(Customer customer:customerList) {
		  List<Book> customerBooklist = customer.getBookList();
		  List<Book> removallist = new ArrayList<Book>();
		  if(customerBooklist.size() > 0) {
			  for(Book custBook:customerBooklist) {
				  if(custBook.equals(foundBook)) {
					  //booklist.remove(book);
					  //customerBooklist.remove(custBook);
					  removallist.add(custBook);
				  }
			  }
			  entitymanager.getTransaction().begin();		 
			  for (Book removal:removallist) 
			  {
				  customerBooklist.remove(removal);
			  }
			 	  
			  entitymanager.persist(customer);
			  entitymanager.getTransaction().commit();
		  }
		  
	  }
	    
	    entitymanager.getTransaction().begin();
		entitymanager.remove(foundBook);
		//commit the transaction if needed
		entitymanager.getTransaction().commit();
		//clean up - close everything
		entitymanager.close();
		entitymanagerfactory.close();
		System.out.println("Removed a book from the book Table");
	}

	@Override
	public void printAllCustomers() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
	    EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	       
	    Query query = entitymanager.createQuery("SELECT c FROM Customer c");
	    @SuppressWarnings("unchecked")
		List<Customer> customers = query.getResultList();
	       
	    System.out.println("List of all Customers: ");
	    for(Customer cust:customers) {
	    	  cust.printCustomer();
	    }	       
	    entitymanager.close();
	    entitymanagerfactory.close();		
	}

	@Override
	public void printAllBooks() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
	    EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	       
	    Query query = entitymanager.createQuery("SELECT b FROM Book b");
	    @SuppressWarnings("unchecked")
		List<Book> books = query.getResultList();
	       
	    System.out.println("List of all Books: ");
	    for(Book book:books) {
	    	  book.printBook();
	    }	       
	    entitymanager.close();
	    entitymanagerfactory.close();	
		
	}

	@Override
	public void findCustomer() {
		System.out.println("Please enter the customer name you would like to find: ");
		String customerName = scan.nextLine();
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		
		Query query = entitymanager.createNamedQuery("Find Customer");
	    query.setParameter("givenName", customerName);
	       
	    Customer customer = (Customer) query.getSingleResult();       
	    System.out.println("Here is a customer record for: ");
	    customer.printCustomer();
		
		entitymanager.close();
		entitymanagerfactory.close();			
	}

	@Override
	public void findBook() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("bookStore");
		EntityManager entitymanager  = entitymanagerfactory.createEntityManager();
		
		System.out.println("Would you like to search by book title or by author?");
		
		boolean flag = true;
		while(flag) {
			System.out.println("Please choose from below options:");
			System.out.println("1. Search by book title");
			System.out.println("2. Search by author");
			int option = scan.nextInt();
			scan.nextLine();
			switch(option) {
			case 1: System.out.println("Please enter the book title: ");
					String bookTitle = scan.nextLine();
					Query query = entitymanager.createNamedQuery("Find by Title");
					query.setParameter("givenTitle", bookTitle);
		       
					Book book = (Book)query.getSingleResult();
					System.out.println("Here are the book details: ");
					book.printBook();
					break;
			case 2: System.out.println("Please enter the author: ");
					String author = scan.nextLine();
					
					Query query1 = entitymanager.createNamedQuery("Find by Author");
					query1.setParameter("givenAuthor", author);
					@SuppressWarnings("unchecked") List<Book> bookList = query1.getResultList();
					System.out.println("Here are the book details: ");
					for(Book booklist: bookList) {
						booklist.printBook();
					}
					break;
			default: System.out.println("Sorry wrong option.");
					 break;
			}
			
			System.out.println("Would you like to search another book? Please enter 'Y' or 'N'");
			String input = scan.next();
			if(input.equals("N")) {
				System.out.println("Thank you for searching.");
				flag = false;
			}
		}
		
		entitymanager.close();
		entitymanagerfactory.close();		
	}
	
}
