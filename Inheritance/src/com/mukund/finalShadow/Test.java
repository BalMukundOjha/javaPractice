package com.mukund.finalShadow;

public class Test {

	public static void main(String[] args) {
		
		B b = new B("mukund",100000, 01,007,200000);
		b.m1();
		System.out.println(b.name);
		System.out.println(b.salary);
		System.out.println(b.id);
		System.out.println(b.code);
		System.out.println("Class B slary "+b.salary);
		
	}

}
