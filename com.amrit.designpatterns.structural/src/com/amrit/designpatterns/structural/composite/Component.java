package com.amrit.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	String name;
	String url;

	List<Component> children = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public void add(Component c) {
		throw new UnsupportedOperationException("This operation is not supported");
	}

	public void remove(Component c) {
		throw new UnsupportedOperationException("This operation is not supported");
	}

	public abstract String toString();
}
