package com.mukund.inheritance;

public class Tester extends Employee {

	String tools;

	public Tester(int id, int name, String dept, double salary, String tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Tester is doing testing work using " + tools);
	}

}
