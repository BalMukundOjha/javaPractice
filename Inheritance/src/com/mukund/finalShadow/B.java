package com.mukund.finalShadow;


public class B extends A {
	
	int id;
	int code;
	double salary;
	public B(String name, double salary, int id, int code, double bsalary) {
		super(name, salary);
		this.id = id;
		this.code = code;
		this.salary = bsalary;
	}

	void m1() {
		
		System.out.println("class B m1 methodS");
	}

}
