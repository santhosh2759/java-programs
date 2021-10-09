package com.learning.java8;

import java.util.stream.Stream;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int[] fibs = {0, 1};
		Stream.generate(() -> {
			int result = fibs[1];
			int fib3 = fibs[0] + fibs[1];
			fibs[0] = fibs[1];
			fibs[1] = fib3;
			return result;
		}).limit(10).forEach(System.out::println);
	}
}
