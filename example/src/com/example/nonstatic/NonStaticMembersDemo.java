package com.example.nonstatic;

public class NonStaticMembersDemo {
	
	int num;
	static int count = 0;
	
	NonStaticMembersDemo(){
		System.out.println("Inside the constructor");
		count++;
		System.out.println(count);
	}
	
	// non static block
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}
	
	static {
		System.out.println("In static block");
	}
	

}
