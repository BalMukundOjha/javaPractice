package com.mukund.synchronization;

public class SyncDemo {

	public static void main(String[] args) {

		DISplayMsg dMsg = new DISplayMsg();

		MyThread t1 = new MyThread(dMsg, "Mukund");
		MyThread t2 = new MyThread(dMsg, "Monu");
		t1.start();
		t2.start();
	}

}
