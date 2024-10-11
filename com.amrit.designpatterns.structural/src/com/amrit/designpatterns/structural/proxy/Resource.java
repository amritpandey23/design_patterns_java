package com.amrit.designpatterns.structural.proxy;

public class Resource implements SensitiveResource {

	@Override
	public void doIt(String message) {
		System.out.println("Message: " + message);
	}

}
