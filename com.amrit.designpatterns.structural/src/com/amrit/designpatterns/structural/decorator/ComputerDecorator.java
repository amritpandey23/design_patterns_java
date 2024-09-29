package com.amrit.designpatterns.structural.decorator;

public abstract class ComputerDecorator implements Computer {
	Computer computer;
	
	public ComputerDecorator(Computer computer) {
		this.computer = computer;
	}
}
