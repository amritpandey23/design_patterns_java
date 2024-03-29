package com.amrit.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new OldEmployee("1234", "Amrit", "Pandey");
		employees.add(employee1);
		
		NewEmployee employee2 = new NewEmployee(4321, "John", "Wick");
		NewEmployeeAdapter employee2Adapter = new NewEmployeeAdapter(employee2);
		employees.add(employee2Adapter);
		
		System.out.println(employees);
	}
}
