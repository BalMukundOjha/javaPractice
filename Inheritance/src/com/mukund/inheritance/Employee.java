package com.mukund.inheritance;

public class Employee {

	int id;
	int name;
	String dept;
	double salary;

	public Employee(int id, int name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	protected void work() {
		System.out.println("Common work for everyone");
	}

}
