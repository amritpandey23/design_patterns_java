package com.amrit.designpatterns.structural.bridge;

public class Play {
	public static void main(String[] args) {
		BackendServer myFirstServer = new MyServer("Here is some of my content"); // implementation 1

		DisplayView desktopView = new DesktopView(); // abstraction 1
		myFirstServer.renderContent(desktopView);

		DisplayView mobileView = new MobileView(); // abstraction 2
		myFirstServer.renderContent(mobileView); 
		
		BackendServer mySecondServer = new MyServer("Here is some more of my content"); // implementation 2

		mySecondServer.renderContent(desktopView);

		mySecondServer.renderContent(mobileView); 
	}
}
