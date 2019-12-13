package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) {
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for(Constructor con:constructors) {
			con.setAccessible(true);
			try {
				Singleton instance1 = (Singleton) con.newInstance();
				Singleton instance2 = (Singleton) con.newInstance();
				System.out.println(instance1.hashCode());
				System.out.println(instance2.hashCode());
				System.out.println(instance1 == instance2);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}

	}

}


class Singleton{
	private Singleton() {}
	private static class Helper{
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return Helper.instance;
	}
}