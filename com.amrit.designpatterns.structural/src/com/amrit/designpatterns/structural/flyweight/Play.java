package com.amrit.designpatterns.structural.flyweight;

public class Play {
	public static void main(String[] args) {
		InventoryManagementSystem ims = new InventoryManagementSystem();
		ims.createOrder("Book", 12);
		ims.createOrder("Compass", 100);
		ims.createOrder("Book", 10);
		ims.createOrder("Cup", 200);
		ims.createOrder("Cup", 300);
		ims.createOrder("Book", 100);
		ims.createOrder("Compass", 10);
		ims.createOrder("Cup", 1);
		ims.createOrder("Book", 21);
		
		System.out.println("Total items = " + ims.totalItems());
	}
}
