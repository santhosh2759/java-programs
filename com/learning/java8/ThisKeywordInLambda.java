package com.learning.java8;


public class ThisKeywordInLambda {
	
	public static void main(String[] args) {
		LambdaThis lamda = new LambdaThis();
		String value = lamda.getValueFromLambda();
		System.out.println(value);
	}
}

@FunctionalInterface
interface MyInterface {
	public String getValue();
}

class LambdaThis {
	private String str = "default value";
	
	public String getValueFromLambda() {
		MyInterface myInterface = () -> {
			String str = "lambda value";
			return this.str;
		};
		return myInterface.getValue();
	}
}