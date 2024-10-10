package com.amrit.designpatterns.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManagementSystem {
	Map<String, Item> items;
	List<Order> orders;

	public InventoryManagementSystem() {
		this.items = new HashMap<>();
	}

	public void createOrder(String itemName, int price) {
		if (!items.containsKey(itemName)) {
			items.put(itemName, new Item(itemName, price));
		}
		Item item = items.get(itemName);
		orders.add(new Order(item));
	}

	public int totalItems() {
		return items.size();
	}
}
