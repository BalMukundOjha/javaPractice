package com.mukund.java8.lambdaexpression.lambdas;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i<=20; i++) {
			System.out.println("MyRUnnable Thread");
		}
	}

}
