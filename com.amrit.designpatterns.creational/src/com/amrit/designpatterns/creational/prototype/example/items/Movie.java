package com.amrit.designpatterns.creational.prototype.example.items;

public class Movie extends Item {
	private String genre;

	public Movie(String title, Double price, String url, String genre) {
		super(title, price, url);
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [genre=" + genre + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getUrl()="
				+ getUrl() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
