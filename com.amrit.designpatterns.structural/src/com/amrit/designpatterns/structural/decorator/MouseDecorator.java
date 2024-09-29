package com.amrit.designpatterns.structural.decorator;

public class MouseDecorator extends ComputerDecorator {

	public MouseDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public String make() {
		return computer.make() + " + Mouse";
	}

}
