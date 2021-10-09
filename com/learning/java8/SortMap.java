package com.learning.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	static Map<String, Double> map = new HashMap<>();

	static {
		map.put("Naresh", 12.00);
		map.put("Santhosh", 11.00);
		map.put("Mahesh", 12.00);
	}

	public static void main(String[] args) {
		sortByMapKeys();
		sortByMapValues();
	}

	static void sortByMapKeys() {
		LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Entry.comparingByKey())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
	}

	static void sortByMapValues() {
		LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Entry.comparingByValue())
				.forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
		System.out.println(linkedHashMap);
	}

}
