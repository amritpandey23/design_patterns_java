package com.amrit.designpatterns.creational.prototype.example.items;

public class Book extends Item {
	private String isbn;

	public Book(String title, Double price, String url, String isbn) {
		super(title, price, url);
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getUrl()="
				+ getUrl() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
