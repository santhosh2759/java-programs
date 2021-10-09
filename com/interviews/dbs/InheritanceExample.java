package com.interviews.dbs;

public class InheritanceExample {

	public static void main(String[] args) {
		//B b = new A(); //compilation error
		A a = new B();
		System.out.println(a.x);//10 runtime polymorphism is applicable for only methods
	}

}

class A {
	int x = 10;
}

class B extends A {
	int x = 20;
}
