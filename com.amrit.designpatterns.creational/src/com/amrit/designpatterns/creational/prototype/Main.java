package com.amrit.designpatterns.creational.prototype;

public class Main {
	public static void main(String[] args) {
		Prototype prototype1 = new Prototype("val1", "val2", new Test());

		System.out.println(prototype1.getVal1() + " " + prototype1.getVal2() + " " + prototype1.getTest());

		Prototype prototype2 = prototype1.clone(); // shallow copy

		System.out.println(prototype2.getVal1() + " " + prototype2.getVal2() + " " + prototype2.getTest());
	}
}
