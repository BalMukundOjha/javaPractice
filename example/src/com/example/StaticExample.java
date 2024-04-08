package com.example;

public class StaticExample {
	
	static int x = 10;
	static int y = 20;
	
	static {
		System.out.println("Static block 2");
		System.out.println("In static block2 "+x);
		System.out.println("In static block2 "+y);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println("In main method "+x);

	}
	
	static {
		System.out.println("Static block 1");
		System.out.println("in static block 1 "+y);
	}
	
	

}
