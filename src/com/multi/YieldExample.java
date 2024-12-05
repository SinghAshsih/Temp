package com.multi;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running: " + i);
			// Call yield method
			Thread.yield(); // Suggest the scheduler that this thread can pause and allow others to run
		}
	}
}

public class YieldExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		// Set thread names
		t1.setName("Thread 1");
		t2.setName("Thread 2");

		// Start both threads
		t1.start();
		t2.start();
	}
}
