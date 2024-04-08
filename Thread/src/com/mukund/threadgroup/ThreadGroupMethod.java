package com.mukund.threadgroup;

public class ThreadGroupMethod {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mgt = new ThreadGroup("MyThreadGroup");
		
		CustomThread thread1 = new CustomThread(mgt, "Thread-1");
		CustomThread thread2 = new CustomThread(mgt, "Thread-2");
		
		thread1.start();
		thread2.start();
		// how may thread active
		System.out.println(mgt.activeCount());
		mgt.list();
		
		Thread.sleep(5000);
		//If thread in sleep then active count will be zero;
		System.out.println(mgt.activeCount());
		
		
		
	}

}
