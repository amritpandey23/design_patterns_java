package com.amrit.designpatterns.creational.prototype;

public class Prototype implements Cloneable {
	private String val1;
	private String val2;
	private Test test;

	public Prototype(String val1, String val2, Test test) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.test = test;
	}

	public Prototype clone() {
		try {
			Prototype cloned = (Prototype) super.clone(); // return this for shallow copy
			cloned.setTest(this.test.clone()); // set property for deep copy
			return cloned;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
