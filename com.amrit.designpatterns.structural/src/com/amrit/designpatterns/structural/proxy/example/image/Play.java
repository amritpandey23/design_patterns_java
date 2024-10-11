package com.amrit.designpatterns.structural.proxy.example.image;

public class Play {
	public static void main(String[] args) {
		Image image1 = new ImageProxy("sample.jpg");
		image1.display();
		
		Image image2 = new ImageProxy("sample.jpg");
		image2.display(); // image from the cache
	}
}
