package com.mukund.custroctorchaning;

public class Child extends Father {
	
	public Child() {
		super(20);
		System.out.println("No Arg Constructor Child Class");
	}
	
	public Child(int x) {
		this();
		System.out.println("Single Arg Constructor Child Class");
	}

}
