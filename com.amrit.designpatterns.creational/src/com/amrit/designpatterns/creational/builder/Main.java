package com.amrit.designpatterns.creational.builder;

public class Main {
	public static void main(String[] args) {

		/*
		 * Typical usage of the builder inside of any target.
		 */
		Target.TargetBuilder<String> builder = new Target.TargetBuilder<String>();
		builder.setKey("value");
		Target<String> target = builder.build();
		System.out.println(target.getKey());
	}
}
