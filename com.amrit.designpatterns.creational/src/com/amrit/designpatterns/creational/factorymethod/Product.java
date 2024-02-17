package com.amrit.designpatterns.creational.factorymethod;

public abstract class Product {
	protected String productName;

	public Product() {
		this.createProduct();
	}

	public abstract void createProduct();

	public String getProductName() {
		return this.productName;
	}
}
