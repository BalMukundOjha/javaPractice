package com.mukund.thread;

public class SingleThread {

	public static void main(String[] args) {
		
		SingleThread st = new SingleThread();
		st.printNumber();
		for (int i = 0; i <= 200; i++) {
			System.out.print("i: "+ i +"\t");
		}
		
	}
	
	void printNumber() {
		for (int j = 0; j <= 200; j++) {
			System.out.print("j: "+ j +"\t");
		}
	}

}
