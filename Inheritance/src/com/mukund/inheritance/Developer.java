package com.mukund.inheritance;

public class Developer extends Employee {

	String technology;

	public Developer(int id, int name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		this.technology = technology;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is doing development work using " + technology);
	}

}
