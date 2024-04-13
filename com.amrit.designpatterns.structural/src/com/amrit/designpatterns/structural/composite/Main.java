package com.amrit.designpatterns.structural.composite;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent("Parent", "");
		Item item1 = new Item("Item1", "");
		Item item2 = new Item("Item2", "");
		Item item3 = new Item("Item3", "");
		Item item4 = new Item("Item4", "");
		parent.add(item1);
		parent.add(item2);
		parent.add(item3);
		parent.add(item4);

		System.out.println(parent);
	}
}
