package com.amrit.designpatterns.structural.bridge;

public class MobileView extends AbstractDisplayView {

	@Override
	protected void dimensions() {
		System.out.println("Mobile View");
		System.out.println("Dimensions = 640 px X 840 px");
	}

	@Override
	public void display(String content) {
		dimensions();
		System.out.println("---");
		System.out.println("Content");
		System.out.println("---");
		System.out.println(content);
	}
}
