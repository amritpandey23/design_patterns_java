package com.amrit.designpatterns.structural.flyweight;

public class Order {
	String itemName;
	int price;

	public Order(Item item) {
		this.itemName = item.itemName;
		this.price = item.price;
	}

	@Override
	public String toString() {
		return "<Order> Item Name: " + itemName + " Price: " + price;
	}

	public String getItemName() {
		return itemName;
	}

	public int getPrice() {
		return price;
	}
}
