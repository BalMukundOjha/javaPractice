package com.mukund.code;

public class EvenNumberThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Even number Thread job is running");
		for (int i = 0; i <= 10; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
		}
	}
}
