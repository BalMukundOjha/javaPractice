package com.mukund.java8.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println("Length of a String: "+f.apply("Mukund"));
		System.out.println("Length of a String: "+f.apply("Mukund jha"));

	}

}
