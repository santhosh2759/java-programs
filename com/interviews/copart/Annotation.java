package com.interviews.copart;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotation {

	public static void main(String[] args) {
		method1();
	}
	
	@Logger
	public static void method1() {}

	@Logger
	public static void method2() {}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Logger{
	
}
