package com.mukund.deadlocks;

public class FirstResource {
	
	public synchronized void m1(SecondResource sr) {
		System.out.println("Inside method1 of FR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2 of SR");
		sr.m2();
	}
	
	public synchronized void m2() {
		System.out.println("Inside methd2 of FR");
	}

}
