package com.mukund.synchronization;

public class DISplayMsg {
	
	public synchronized void sayHello(String name) {
		for (int i = 0; i <=10; i++) {
			System.out.println("How r u? "+name);
		}
	}

}
