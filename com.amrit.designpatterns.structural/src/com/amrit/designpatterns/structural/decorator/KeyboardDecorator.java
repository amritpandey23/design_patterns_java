package com.amrit.designpatterns.structural.decorator;

public class KeyboardDecorator extends ComputerDecorator {
	public KeyboardDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public String make() {
		return computer.make() + " + Keyboard";
	}
}
