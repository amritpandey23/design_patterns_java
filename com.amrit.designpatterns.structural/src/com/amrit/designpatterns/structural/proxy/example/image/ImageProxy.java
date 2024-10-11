package com.amrit.designpatterns.structural.proxy.example.image;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image {
	private String imagePath;

	private static Map<String, Image> images = new HashMap<>();

	public ImageProxy(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public void display() {
		// lookup cached images
		if (!images.containsKey(imagePath)) {
			images.put(imagePath, new ConcreteImage(imagePath));
		}
		
		System.out.println("Concrete image memory address: " + images.get(imagePath));

		// display images from cache
		images.get(imagePath).display();
	}
}
