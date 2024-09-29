package com.amrit.designpatterns.structural.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		Computer myComputer = new MouseDecorator(new KeyboardDecorator(new SimpleComputer()));
		
		System.out.println(myComputer.make());
	}
}
