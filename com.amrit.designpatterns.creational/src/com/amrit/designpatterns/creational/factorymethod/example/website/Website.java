package com.amrit.designpatterns.creational.factorymethod.example.website;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}
	
	public void addPage(Page page) {
		this.pages.add(page);
	}
	
	public abstract void createWebsite();
}
