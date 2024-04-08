package com.mukund.java8.lambdaexpression;

@FunctionalInterface
public interface B extends A {
	
	void m1();// same method signature no CTE
	//void m2();//CTE

}
