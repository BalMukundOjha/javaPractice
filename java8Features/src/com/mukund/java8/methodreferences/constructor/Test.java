package com.mukund.java8.methodreferences.constructor;

public class Test {

	public static void main(String[] args) {
		
		MyInterface f = s-> new MyClass(s);
		f.get(" using lambdas");
		
		MyInterface f2 = MyClass::new;
		f2.get("using construtor mapping");

	}

}
