package bnym.casestudy.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	private int bookId;
	
	@Basic
	private String Title;
	
	@Basic
	private String genre;
	
	@Basic 
	private String author;
	
	@Basic
	private String imageLink;
	
	@Basic
	private double price;
	
	@Basic
	private boolean onSale;
	
	@Basic
	private int numberOfCopies;
	
	public Book() {
		
	}
	
	/**
	 * @param bookId
	 * @param title
	 * @param genre
	 * @param author
	 * @param imageLink
	 * @param price
	 * @param onSale
	 * @param numberOfCopies
	 */
	public Book(int bookId, String title, String genre, String author, String imageLink, double price, boolean onSale,
			int numberOfCopies) {
		super();
		this.bookId = bookId;
		Title = title;
		this.genre = genre;
		this.author = author;
		this.imageLink = imageLink;
		this.price = price;
		this.onSale = onSale;
		this.numberOfCopies = numberOfCopies;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
}
