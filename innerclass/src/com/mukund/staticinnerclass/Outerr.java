package com.mukund.staticinnerclass;

public class Outerr {

	static void f1() {
		System.out.println("Outer class static method");
	}

	static class Inner {
		static void f2() {
			System.out.println("ineer class static method");
		}
		
		void f3() {
			System.out.println("inner class non-static method");
		}
	}

	public static void main(String[] args) {
		
		Outerr.f1();
		//to access inner class static method  outer clas name. inner class name.method name
		Outerr.Inner.f2();
		//
		Outerr.Inner inner = new Outerr.Inner();
		inner.f3();
		
	}

}
