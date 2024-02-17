package com.amrit.designpatterns.creational.factorymethod;

public class ProductFactory {
	public static Product getProduct(ProductType productType) {
		switch (productType) {
		case ITEM1:
			return new ProductItem1();
		case ITEM2:
			return new ProductItem2();
		}
		return null;
	}
}
