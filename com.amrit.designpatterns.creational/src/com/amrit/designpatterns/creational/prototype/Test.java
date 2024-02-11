package com.amrit.designpatterns.creational.prototype;

public class Test implements Cloneable {
	public Test clone() {
		try {
			return (Test) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
