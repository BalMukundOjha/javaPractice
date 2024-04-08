package com.mukund.synchronization.blocks;

public class DISplayMsg {
	
	public  void sayHello(String name) {
		// any code can go here multiple thread can access lines of code
		// except only the syncronized block of code only very first thread can access it
		// other thread need to wait to execute that block of code
		
		synchronized (this) {
			for (int i = 0; i <=10; i++) {
				System.out.println("How r u? "+name);
			}
		}	
		// class level lock
		 synchronized (DISplayMsg.class) {
			for (int i = 0; i <=10; i++) {
				System.out.println("How r u? "+name);
			}
		}	
		 // any object u can pass
		 synchronized (new String()) {
				for (int i = 0; i <=10; i++) {
					System.out.println("How r u? "+name);
				}
			}	
	}

}
