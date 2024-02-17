package com.amrit.designpatterns.creational.factorymethod;

public class Main {
	public static void main(String[] args) {

		Product item1 = ProductFactory.getProduct(ProductType.ITEM1);
		Product item2 = ProductFactory.getProduct(ProductType.ITEM2);

		System.out.println(item1.getProductName());
		System.out.println(item2.getProductName());

	}
}
