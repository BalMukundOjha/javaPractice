package com.mukund.interrput;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println("Iam Lazy thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Lazy thread Interrupted");
			}
			
		}
  
	}
}
