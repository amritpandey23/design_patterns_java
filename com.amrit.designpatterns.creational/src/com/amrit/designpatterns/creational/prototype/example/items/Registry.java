package com.amrit.designpatterns.creational.prototype.example.items;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Item> registry = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public void loadItems() {
		Movie movie = new Movie("Tenet", 12.23, "http://movie.com", "thriller");
		this.registry.put("movie", movie);

		Book book = new Book("Game of Thrones", 23.12, "http://got.com", "I898989");
		this.registry.put("book", book);
	}

	public Item createItem(String itemName) {
		Item item = null;
		try {
			item = (Item) this.registry.get(itemName).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
}
