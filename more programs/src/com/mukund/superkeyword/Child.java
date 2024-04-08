package com.mukund.superkeyword;

public class Child extends Parent {

	public Child(int a, int b) {
		// Super(a,b) method use to call parent class constructor. if parent class have constructor child need to explicitly implement
		super(a, b);
		System.out.println("Parent class constructor value"+super.a);
		System.out.println("Parent class constructor value"+super.b);
	}

	void p1() {
		super.p1();
		System.out.println("Child class p1 method");
	}
}
