package com.amrit.designpatterns.creational.singleton.example.db;

public class Play {
	public static void main(String[] args) {
		DbSingleton db = DbSingleton.getInstance();
		DbSingleton db2 = DbSingleton.getInstance();
		
		System.out.println(db);
		System.out.println(db2); // same address
	}
}
