package com.mukund.practice.multilevelInheritance;

public class JDK8 extends JDK7 {
	
	public JDK8() {
		System.out.println("Instantiating JDK8");
	}
	
	{
		System.out.println("JDK8 static block");
	}

}
