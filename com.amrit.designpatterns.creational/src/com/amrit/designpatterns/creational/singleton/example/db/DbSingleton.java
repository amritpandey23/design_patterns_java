package com.amrit.designpatterns.creational.singleton.example.db;

public class DbSingleton {
	private static DbSingleton instance;

	private DbSingleton() {
	}

//	private static class LazyHolder {
//		static final DbSingleton INSTANCE = new DbSingleton();
//	}

	public static DbSingleton getInstance() {
		DbSingleton result = instance;
		if (result == null) {
			synchronized (DbSingleton.class) {
				result = instance;
				if (result == null) {
					result = new DbSingleton();
					instance = result;
				}
			}
		}
//		if (instance == null) {
//			instance = new DbSingleton();
//		}
//		return LazyHolder.INSTANCE;
		return result;
	}
	
	
}
