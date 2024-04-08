package com.mukund.synchronization.classlock;

public class ClassLevelLock{

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Mukund");
		MyThread t2 = new MyThread("Monu");
		t1.start();
		t2.start();
	}

}
