package com.learning.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Santhosh", 2500, 30));
		list.add(new Employee("Mahesh", 1500, 20));
		list.add(new Employee("Madhu", 1500, 10));

		// sort by name using comparable
		sortByNameUsingComparable(list);
		// sort by salary using comparator
		sortBySalaryUsingComparator(list);
		// sort by salary if the salary is same then sort by name
		sortBySalaryName(list);
	}

	static void sortBySalaryName(List<Employee> list) {
		list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println(list);
	}

	static void sortBySalaryUsingComparator(List<Employee> list) {
		List<Employee> sortedList = list.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedList);
	}

	static void sortByNameUsingComparable(List<Employee> list) {
		List<Employee> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
