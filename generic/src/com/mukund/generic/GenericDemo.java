package com.mukund.generic;

public class GenericDemo {

	public static void main(String[] args) {
		
		MyGeneric<String> s = new MyGeneric<>("Mukund");
		s.displayOject();
		System.out.println(s.getObject());
		
		MyGeneric<Integer> i = new MyGeneric<>(1213);
		i.displayOject();
		System.out.println(i.getObject());
		
		MyGeneric<Double> d = new MyGeneric<>(43.56);
		d.displayOject();
		System.out.println(d.getObject());
		
	}

}
