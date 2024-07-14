package com.amrit.designpatterns.structural.facade;

public class Facade {
	ClassA classA;
	ClassB classB;

	public Facade() {
		this.classA = new ClassA();
		this.classB = new ClassB();
	}

	public void doSomethingWithA() {
		this.classA.doSomething();
	}

	public void doSomethingWithB() {
		this.classB.doSomething();
	}
}
