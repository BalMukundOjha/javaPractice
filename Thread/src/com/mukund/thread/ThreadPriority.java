package com.mukund.thread;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		
		ThreadPriority tPriority = new ThreadPriority();
		tPriority.setPriority(MIN_PRIORITY);
		tPriority.setName("MIN_PRIORITY 1 thread");
		tPriority.start();
		
		ThreadPriority tPriority1 = new ThreadPriority();
		tPriority1.setName("MAX_PRIORITY 2 thread");
		tPriority1.setPriority(MAX_PRIORITY);
		tPriority1.start();
		
		

	}
	
	public void run() {
		System.out.println("Thread name "+ Thread.currentThread().getName());
	}

}
