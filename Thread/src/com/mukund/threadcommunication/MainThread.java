package com.mukund.threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		
		synchronized (thread) {
			System.out.println("Main Thread is going to Wait");
			thread.wait();
			System.out.println("Main Thread Nofiy by Child Thread");
			System.out.println("Total Sum calculated by Child Thread: "+thread.total);
		}
		
	}

}
