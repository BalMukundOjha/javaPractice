package com.oops.primitive;

public class Test {

	public static void main(String[] args) {
		
//		int x = 10;
//		System.out.println(x);
//		char name = 'B';
//		System.out.println(name);
//		
//		int y = name;
//		System.out.println(y);
//		
//		double z = 10;
//		System.out.println(z);
//		
//		int a = (int)z;
//		System.out.println(a);
		
		
		
		Book b = new Book();
		System.out.println("B ref "+b);
		
		Book c = new Book();
		System.out.println("C ref "+c);
		
		Book d = c;
		System.out.println("D ref "+d);
		
		c = null;
		System.out.println("============================================");
		System.out.println("B ref "+b);
		System.out.println("C ref "+c);
		System.out.println("D ref "+d);
		

	}

}

class Book{
	
	
	public void m1() {
		System.out.println("inside Book class under m1 method");
	}
}
