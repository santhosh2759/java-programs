package com.interviews;

public class BillPughSingleton {
	
	private BillPughSingleton() {}

	private static class Helper {
		final static BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return Helper.INSTANCE;
	}
}
