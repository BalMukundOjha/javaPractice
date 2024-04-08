package com.mukund.java8.methodreferences.usingstaticref;

public class MethodRefDemo {

	public static int myMethod() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Running Runnable run() method using method ref concept");
		}
		return 0;
	}

	public static void main(String[] args) {

		Runnable r = MethodRefDemo::myMethod;
		Thread t = new Thread(r);
		t.start();

	}

}
