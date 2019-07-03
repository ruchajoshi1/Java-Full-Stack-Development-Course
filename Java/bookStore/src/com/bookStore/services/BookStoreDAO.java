package com.bookStore.services;

public interface BookStoreDAO {
	
	void addCustomer();
	void addBook();
	void findCustomer();
	void findBook();
	void updateCustomerTable();
	void updateBookTable();
	void removeCustomer();
	void removeBook();
	void printAllCustomers();
	void printAllBooks();	
}
