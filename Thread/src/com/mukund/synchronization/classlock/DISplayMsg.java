package com.mukund.synchronization.classlock;

public class DISplayMsg {
	
	public synchronized static void sayHello(String name) throws InterruptedException {
		for (int i = 0; i <=10; i++) {
			System.out.println("How r u? "+name);
			Thread.sleep(2000);
		}
	}

}
