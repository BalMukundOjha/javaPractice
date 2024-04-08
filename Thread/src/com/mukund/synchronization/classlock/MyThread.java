package com.mukund.synchronization.classlock;

public class MyThread extends Thread {
	
	
	String name;
	
	public MyThread(String name) {
		this.name = name;	
	}
	
	public void run() {
		try {
			DISplayMsg.sayHello(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
