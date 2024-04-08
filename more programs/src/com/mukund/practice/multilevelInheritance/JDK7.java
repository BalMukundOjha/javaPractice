package com.mukund.practice.multilevelInheritance;

public class JDK7 extends JDK6 {
	
	{
		System.out.println("JDK7 static block");
	}

	public JDK7(){
		System.out.println("Instantiating JDK7");
	}
}
