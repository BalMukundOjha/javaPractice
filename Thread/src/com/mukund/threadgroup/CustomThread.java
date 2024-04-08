package com.mukund.threadgroup;

public class CustomThread extends Thread {
	
	public CustomThread(ThreadGroup group, String name) {
		// Already in Parent Thread class there is a constructor wich take
		//Thread group and String as input
		super(group, name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
