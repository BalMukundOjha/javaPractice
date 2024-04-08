package com.mukund.nonstaticinnerclass;

public class Outer {
	
	private static int x = 50;
	private int y;
	
	public Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer class Non Static Method");
	}
//=============================================================================
	class Inner {
		private int y;
		
		public Inner(int y) {
			this.y = y;
		}
		void f2() {
			System.out.println("Outer class static variable "+Outer.x);
			System.out.println("Accessing Outer class non static variable "+Outer.this.y);
			System.out.println("Inner class non static variable "+this.y);
		}
	}
//================================================================================
	public static void main(String[] args) {

		Outer outer = new Outer(80);
		outer.f1();
		
		// to create Inner class Object
		
		Outer.Inner inner = outer.new Inner(60);
		inner.f2();
	}

}
