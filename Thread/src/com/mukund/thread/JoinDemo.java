package com.mukund.thread;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum;
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println("Enter first N number");
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
		JoinDemo jDemo = new JoinDemo();
		jDemo.start();
		jDemo.join();
		System.out.println("Sum of first "+JoinDemo.n + " Numbers is "+JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by program "+(end - start)/1000+" seconds");
		
	}
	
	public void run() {
		for (int i = 0; i < JoinDemo.n; i++) {
			JoinDemo.sum += i;
		}
	}

}
