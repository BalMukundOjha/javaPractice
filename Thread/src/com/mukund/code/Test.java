package com.mukund.code;

public class Test {

	public static void main(String[] args) {
		
		EvenNumberThread evenThread = new EvenNumberThread();
		OddNumberThread oddThread = new OddNumberThread();
		
		Thread even = new Thread(evenThread);
		Thread odd = new Thread(oddThread);
		even.start();
		odd.start();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		
	}

}
