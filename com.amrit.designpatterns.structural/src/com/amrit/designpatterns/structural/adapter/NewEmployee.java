package com.amrit.designpatterns.structural.adapter;

public class NewEmployee {
	private int id;

	public NewEmployee(int id, String firstName, String surname) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
	}

	private String firstName;
	private String surname;

	public int getIdNumber() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getSurname() {
		return this.surname;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
