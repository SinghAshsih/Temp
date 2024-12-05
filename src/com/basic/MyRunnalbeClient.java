package com.basic;

public class MyRunnalbeClient {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable); // new 
		thread.start(); // runnable 
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
