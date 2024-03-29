package com.amrit.designpatterns.structural.adapter;

public class OldEmployee implements Employee {
	private String id;
	private String firstName;
	private String lastName;

	public OldEmployee(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
