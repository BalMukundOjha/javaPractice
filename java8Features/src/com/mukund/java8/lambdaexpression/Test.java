package com.mukund.java8.lambdaexpression;

public class Test {

	public static void main(String[] args) {

		A a = () -> System.out.println("inside m1()");
		a.m1();
		
		Sum sum = (x,y)->System.out.println("Sum is:"+(x+y));
		sum.sum(20, 30);
		
	}

}
