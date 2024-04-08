package com.mukund.java8.lambdaexpression.lambdas;

public class Test {

	public static void main(String[] args) {

//		Runnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		// above code now covert in lambda expression
//		Runnable r = () -> {
//			for (int i = 0; i <= 20; i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//--------------------------------------------------------------------		
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i <= 20; i++) {
//					System.out.println("Child Thread");
//				}		
//			}
//		});
//		thread.start();
		
		
		// converting above anonymous class to lambda 
		
		Thread t = new Thread(()->{
			for (int i = 0; i <= 20; i++) {
				System.out.println("Child Thread");
			}	
		});
		t.start();

		for (int i = 0; i <= 20; i++) {
			System.out.println("Main Thread");
		}

	}

}
