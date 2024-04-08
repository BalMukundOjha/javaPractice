package com.mukund.runnable;

public class CheckProcessor implements Runnable{

	public static void main(String[] args) {
		
		CheckProcessor cp = new CheckProcessor();
		Thread thread = new Thread(cp);
		thread.start();

	}

	
	
	
	
	@Override
	public void run() {
		
		System.out.println("Processed the checks");
	}

}
