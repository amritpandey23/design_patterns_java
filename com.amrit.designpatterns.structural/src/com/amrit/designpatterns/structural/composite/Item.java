package com.amrit.designpatterns.structural.composite;

public class Item extends Component {

	public Item(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
