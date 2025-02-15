package com.mukund.threadgroup;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
//		ThreadGroup parent = new ThreadGroup("Parent");
//		System.out.println(parent.getName());
		ThreadGroup child = new ThreadGroup("Child");
		child.setMaxPriority(3);
//		System.out.println(child.getName());
		
		Thread thread1 = new Thread(child, "Thread-1");
		Thread thread2 = new Thread(child, "Thread-2");
		System.out.println(thread1.getThreadGroup().getName());
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getThreadGroup().getName());
		System.out.println(thread1.getPriority());
	}

}
