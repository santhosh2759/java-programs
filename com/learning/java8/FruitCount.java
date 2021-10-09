package com.learning.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitCount {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> countMap = countFruits(fruits);

		sortByKey(countMap);

		sortByKeyReversed(countMap);

		sortByValue(countMap);

		sortByValueReversed(countMap);
	}

	static Map<String, Long> countFruits(List<String> fruits) {
		Map<String, Long> countMap = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);
		System.out.println();
		return countMap;
	}

	static void sortByValueReversed(Map<String, Long> countMap) {
		System.out.println("Sorted by value in reversed order===>");
		Map<String, Long> linkedHashMap = new LinkedHashMap<>();
		countMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
	}

	static void sortByValue(Map<String, Long> countMap) {
		System.out.println("Sorted by value===>");
		Map<String, Long> linkedHashMap = new LinkedHashMap<>();
		countMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
		System.out.println();
	}

	static void sortByKeyReversed(Map<String, Long> countMap) {
		System.out.println("Sorted by key in reversed order===>");
		Map<String, Long> linkedHashMap = new LinkedHashMap<>();
		countMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
		System.out.println();
	}

	static void sortByKey(Map<String, Long> countMap) {
		System.out.println("Sorted by key===>");
		Map<String, Long> linkedHashMap = new LinkedHashMap<>();
		countMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
		System.out.println();
	}

}
