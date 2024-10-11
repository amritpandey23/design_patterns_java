package com.amrit.designpatterns.structural.proxy.example.image;

public class ConcreteImage implements Image {
	private String imagePath;

	public ConcreteImage(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public void display() {
		System.out.println("Displaying image from: " + imagePath);
	}
}
