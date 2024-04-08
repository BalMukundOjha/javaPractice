package com.mukund.synchronization;

public class MyThread extends Thread {
	
	DISplayMsg dMsg;
	String name;
	
	public MyThread(DISplayMsg dMsg, String name) {
		this.dMsg = dMsg;
		this.name = name;	
	}
	
	public void run() {
		dMsg.sayHello(name);
	}

}
