package com.amrit.designpatterns.structural.adapter;

public class NewEmployeeAdapter implements Employee {
	
	private NewEmployee employee;

	public NewEmployeeAdapter(NewEmployee employee) {
		this.employee = employee;
	}

	@Override
	public String getId() {
		return String.valueOf(employee.getIdNumber());
	}

	@Override
	public String getFirstName() {
		return employee.getFirstName();
	}

	@Override
	public String getLastName() {
		return employee.getSurname();
	}
	
	@Override
	public String toString() {
		return employee.toString();
	}

}
