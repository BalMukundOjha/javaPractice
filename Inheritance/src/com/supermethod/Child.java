package com.supermethod;

public class Child extends Parent {
	int c;
	int d;
	public Child(int a, int b, int c, int d) {
		super(a, b);
		System.out.println("Parent class constructor value1 "+super.a);
		System.out.println("Parent class constructor value2 "+super.b);
		System.out.println("========================================");
		this.c = c;
		this.d = d;
		System.out.println("CHild Class Constructor value1 "+this.c);
		System.out.println("CHild Class Constructor value2 "+this.d);
	}

	void m1() {
		System.out.println("Child class m1 method");
	}

}
