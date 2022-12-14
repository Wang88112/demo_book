package com.example.demo_book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "ISBN")
	private String ISBN;

	@Column(name = "bookName")
	private String bookName;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
	private int price;

	@Column(name = "inventory")
	private int inventory;

	@Column(name = "sales")
	private int sales;

	@Column(name = "kind")
	private String kind;

	public Book() {

	}

	public Book(String ISBN, String bookName, String author, int price, int inventory, String kind) {

	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
