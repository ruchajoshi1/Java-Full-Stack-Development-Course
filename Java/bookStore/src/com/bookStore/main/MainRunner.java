/**
 * 
 */
package com.bookStore.main;

import java.util.Scanner;

import com.bookStore.services.BookStoreDAO;
import com.bookStore.services.Services;

/**
 * @author rucha.joshi
 * Main runner to execute book store program
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		
		//create an object of a service class
		BookStoreDAO service = new Services();
		
		while(flag) {
			System.out.println("Please select the menu option: ");
			System.out.println("----------------------------------");
			System.out.println("1. Add a new Customer");
			System.out.println("2. Add a new Book to book list");
			System.out.println("3. Update a customer");
			System.out.println("4. Update a book in book list");
			System.out.println("5. Remove a customer");
			System.out.println("6. Remove a book from book list");
			System.out.println("7. Print a Customer List");
			System.out.println("8. Print a book list");
			System.out.println("9. Find a customer's record");
			System.out.println("10. Find a book");
			System.out.println("11. Exit");
			
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1: service.addCustomer();
					break;
			case 2: service.addBook();
					break;
			case 3: service.updateCustomerTable();
					break;
			case 4: service.updateBookTable();
					break;
			case 5: service.removeCustomer();
					break;
			case 6: service.removeBook();
					break;
			case 7: service.printAllCustomers();
					break;
			case 8: service.printAllBooks();
					break;
			case 9: service.findCustomer();
					 break;
			case 10: service.findBook();
			 		 break;
			case 11: System.out.println("Thank you for using our service.");
					 System.exit(0);
			default: System.out.println("Sorry invalid option.");
					 System.exit(0);		
			}
			System.out.println("Would you like to choose another option? Choose 'Y' or 'N' ");
			String option = scan.next();
			if(option.equals("N")) {
				System.out.println("Thank you for using our service.");
				flag = false;
			}
		}
		scan.close();
	}

}
