package com.learning.java8;

import java.util.stream.IntStream;

public class EvenNumbers {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 20).filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
