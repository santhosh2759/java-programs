package com.learning.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalary {

	static List<Employee> employees = Arrays.asList(new Employee("Santhosh", 1000, 10),
			new Employee("Karthik", 2000, 10), new Employee("Venkatesh", 3000, 20),
			new Employee("Yashwanth", 4000, 20));

	public static void main(String[] args) {
		highestSalary();
		highestSalaryForEachDept();
		salaryInRange(1500, 3500);
	}

	private static void salaryInRange(int min, int max) {
		List<Employee> list = employees.stream().filter(e -> e.getSalary() < max && e.getSalary() > min)
				.collect(Collectors.toList());
		System.out.println(list);
	}

	static void highestSalary() {
		// yashwanth, because he comes first in the list
		employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				.ifPresent(System.out::println);
	}

	static void highestSalaryForEachDept() {
		Map<Integer, Employee> map = employees.stream().collect(Collectors.groupingBy(Employee::getDeptNo, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
		System.out.println(map);
	}

}
