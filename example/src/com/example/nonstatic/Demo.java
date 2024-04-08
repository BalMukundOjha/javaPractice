package com.example.nonstatic;

public class Demo {
	
	static Demo objDemo;

//	static int x = 10;
//	static {
//		Demo obj = new Demo();
//		System.out.println(Demo.x);
//		obj.m1();
//		Demo.m1();
//	}
//	
//	static void m1() {
//		System.out.println("Static method");
//	}
	
	static {
		System.out.println(objDemo);
		Demo.objDemo = new Demo();
		System.out.println(objDemo);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(Demo.objDemo);
		System.out.println(new Demo());
		
	}
	
	

}
