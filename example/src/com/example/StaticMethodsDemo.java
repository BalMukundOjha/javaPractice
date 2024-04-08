package com.example;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		StaticMethodsDemo.method1();
	}

	static void method1() {
		System.out.println("inside static method1");
	}

	static {
		System.out.println("Inside the static block");
		StaticMethodsDemo.method1();
	}

}
