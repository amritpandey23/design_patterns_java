package com.amrit.designpatterns.structural.composite;

import java.util.Iterator;

public class Parent extends Component {

	public Parent(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public void add(Component c) {
		this.children.add(c);
	}
	
	@Override
	public void remove(Component c) {
		this.children.remove(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + "\n");
		Iterator<Component> itr = this.children.iterator();
		while (itr.hasNext()) {
			sb.append(itr.next().toString() + " ");
		}
		return sb.toString();
	}

}
