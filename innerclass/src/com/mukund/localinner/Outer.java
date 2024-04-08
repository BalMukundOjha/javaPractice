package com.mukund.localinner;

public class Outer {

	void f1() {
		System.out.println("Inside Outer f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside localInners f2()");
			}
		}
		LocalInner local = new LocalInner();
		local.f2();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.f1();

	}

}
