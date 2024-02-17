package com.amrit.designpatterns.creational.factorymethod.example.website;

public class AboutWebsite extends Website {

	@Override
	public void createWebsite() {
		Page aboutPage = new AboutPage();
		addPage(aboutPage);
	}

}
