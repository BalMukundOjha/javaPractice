package com.mukund.reflection;

@MyAnnotation(value1 = "123", value2 = "546")
public class Calculator {

	private double num1;
	private double num2;

	public Calculator() {
		System.out.println("Calculator Default COnstructor");
	}

	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double sum(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}

}
