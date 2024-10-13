package com.amrit.designpatterns.structural.bridge;

public class DesktopView extends AbstractDisplayView {

	@Override
	public void dimensions() {
		System.out.println("Desktop View");
		System.out.println("Dimensions = 1080 px X 720 px");
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
