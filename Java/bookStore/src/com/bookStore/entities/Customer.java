package com.bookStore.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table
@NamedQuery(query = "SELECT c FROM Customer c where c.name = :givenName", name="Find Customer")
public class Customer {

	@Id 
	@Column(name = "customerId")
	@TableGenerator(name="tab", initialValue=0, allocationSize=50)
	@GeneratedValue(strategy = GenerationType.TABLE, generator="tab")
	private int custId;
	
	@Basic
	@Column(name = "name")
	private String name;
	
	//@OneToMany(cascade = CascadeType.ALL,mappedBy="Book.BookId")
			//targetEntity = Customer.class)
	//@JoinColumn(name = "books",referencedColumnName="BookId")
	//private List bookList;
	//private ArrayList<Book> bookList = new ArrayList<Book>();
	private List<Book> bookList = new ArrayList<Book>();
	/**
	 * @param custId
	 * @param name
	 * @param bookList
	 */
	public Customer(int custId, String name, ArrayList<Book> bookList) {
		super();
		this.custId = custId;
		this.name = name;
		this.bookList = bookList;
	}
	
	public Customer(){
		
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void printCustomer() {
		System.out.println(this.custId + " " + this.name);
		//check if customer has books in the list
		if(bookList.size() !=0 ) {
			System.out.println("Following are the books for " + this.name);
		  for(Book bookList:bookList) {
		  	//System.out.println(bookList);
		  	bookList.printBook();
		  }
		} else {
			System.out.println(this.name + " does not have any books.");
		}
	}

}
