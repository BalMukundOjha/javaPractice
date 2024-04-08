package com.mukund.overriding;

public class Overriding {

	public static void main(String[] args) {
		
		Parent.doSomethting();
		Child.doSomethting();
		
		Parent parent = new Parent();
		System.out.println(parent.s);
		
		Child c = new Child();
		System.out.println(c.s);
		
		Parent c1 = new Child();
		System.out.println(c1.s);
		
		
		
		
	}

}
