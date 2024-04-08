package com.mukund.java8.methodreferences.instance;

public class MethodInstanceRefDemo {

	void myaddMethod(int x, int y) {
		System.out.println("sum: "+(x+y));
	}

	public static void main(String[] args) {
		
		MethodInstanceRefDemo instanceRef = new MethodInstanceRefDemo();
		Addition addition = instanceRef::myaddMethod;
		addition.add(20, 40);
	}

}
