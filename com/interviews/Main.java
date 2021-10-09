package com.interviews;

public class Main {

	public static void main(String[] args) {
		BillPughSingleton instance = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = BillPughSingleton.getInstance();
		System.out.println(instance == instance2);
	}

}
