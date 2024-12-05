package com.multi;

class MyThread1 extends Thread {
	private String threadName;

	public MyThread1(String name) {
		this.threadName = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(threadName + " is running, step: " + i);
			try {
				Thread.sleep(500); // Sleep for 500 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName + " has finished execution.");
	}
}

public class ThreadJoinExample {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("Thread-1");
		MyThread1 t2 = new MyThread1("Thread-2");
		MyThread1 t3 = new MyThread1("Thread-3");

		t1.start(); // Start thread t1
		t2.start(); // Start thread t2
		t3.start(); // Start thread t3

		try {
			// Ensure main thread waits for t1, t2, t3 to finish
			t1.join(); // Main thread waits until t1 completes
			t2.join(); // Main thread waits until t2 completes
			t3.join(); // Main thread waits until t3 completes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads have finished execution, now main thread continues.");
	}
}
