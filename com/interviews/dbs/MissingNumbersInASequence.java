package com.interviews.dbs;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MissingNumbersInASequence {

	public static void main(String[] args) {
		//IntStream.rangeClosed(100, 110)
		//.filter( i -> isNotThere(i)).boxed().forEach(System.out::println);
		IntStream.rangeClosed(100, 110)
			.filter(MissingNumbersInASequence::isNotThere)
			.boxed().forEach(System.out::println);
		
	}

	private static boolean isNotThere(int j) {
		int[] arr = {101,103,100,103,105,108,109,110};
		IntPredicate isSame = index -> index == j;
		return IntStream.of(arr).noneMatch(isSame);
	}

}
