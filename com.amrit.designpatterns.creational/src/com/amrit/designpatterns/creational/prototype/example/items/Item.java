package com.amrit.designpatterns.creational.prototype.example.items;

public abstract class Item implements Cloneable {
	private String title;
	private Double price;
	private String url;

	public Item(String title, Double price, String url) {
		super();
		this.title = title;
		this.price = price;
		this.url = url;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", price=" + price + ", url=" + url + "]";
	}

}
