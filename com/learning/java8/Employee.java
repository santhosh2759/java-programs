package com.learning.java8;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int salary;
	private int deptNo;
	
	public Employee(String name, int salary, int deptNo) {
		super();
		this.name = name;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + deptNo + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return getName().compareTo(o.getName());
	}
	
}
