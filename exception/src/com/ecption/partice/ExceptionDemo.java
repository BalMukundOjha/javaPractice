package com.ecption.partice;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		

	}

}
