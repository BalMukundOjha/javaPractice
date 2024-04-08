package com.mukund.deadlocks;

public class SecondResource {
	
	public synchronized void m1(FirstResource fr) {
		System.out.println("Inside method1 of SR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2 of FR");
		fr.m2();
	}
	
	public synchronized void m2() {
		System.out.println("Inside methd2 of SR");
	}

}
