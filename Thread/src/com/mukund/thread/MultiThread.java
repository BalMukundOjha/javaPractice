package com.mukund.thread;

public class MultiThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThread mt = new MultiThread();
		mt.start();

		Thread currenThread = Thread.currentThread();
		System.out.println("Thread Name is " + currenThread.getName());

		/*
		 * for (int i = 0; i <= 200; i++) { System.out.print("i: "+ i +"\t");
		 * Thread.sleep(1000); }
		 */
	}

	public void run() {
		Thread currenThread = Thread.currentThread();
		currenThread.setName("Print the numbers");
		System.out.println("Thread Name is " + currenThread.getName());

		/*
		 * for (int j = 0; j <= 200; j++) { System.out.print("j: "+ j +"\t"); try {
		 * Thread.sleep(1000); } catch (InterruptedException e) {
		 * System.out.println("Child thread exiting"); } }
		 */
	}

}
