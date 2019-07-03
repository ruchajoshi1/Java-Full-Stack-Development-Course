package com.bookStore.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
@NamedQuery(query="SELECt b FROM Book b where b.bookTitle = :givenTitle", name="Find by Title"),
@NamedQuery(query="SELECt b FROM Book b where b.author = :givenAuthor", name="Find by Author")
})
public class Book {

	@Id
	@Column(name = "BookId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	@Basic
	@Column(name = "bookTitle")
	private String bookTitle;
	
	@Basic
	@Column(name = "publishYear")
	private String publishYear;
	 
	@Basic
	@Column(name= "author")
	private String author;
	
	/**
	 * @param bookId
	 * @param bookTitle
	 * @param publishYear
	 * @param author
	 */
	public Book(int bookId, String bookTitle, String publishYear, String author) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.publishYear = publishYear;
		this.author = author;
	}
	
	public Book() {
		
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printBook() {
		System.out.println(this.bookId + " " + this.bookTitle + " " + this.publishYear + " " + this.author);
	}
	
}
