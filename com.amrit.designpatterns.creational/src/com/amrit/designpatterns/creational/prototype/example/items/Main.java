package com.amrit.designpatterns.creational.prototype.example.items;

public class Main {
	public static void main(String[] args) {
		Registry reg = new Registry();
		
		Movie movie = (Movie) reg.createItem("movie"); // shallow copy
		
		Book book = (Book) reg.createItem("book"); // shallow copy
		
		System.out.println(movie.toString());
		System.out.println(book.toString());
	}
}
