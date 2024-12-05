package com.ashish.singh;

public class DeadlockExample {
	public static void main(String[] args) {
		// Resources
		final String resource1 = "Resource1";
		final String resource2 = "Resource2";

		// Thread 1
		Thread t1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName() + " locked " + resource1);

				try {
					// Simulate some work with resource1
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " locked " + resource2);
				}
			}
		});

		// Thread 2
		Thread t2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println(Thread.currentThread().getName() + " locked " + resource2);

				try {
					// Simulate some work with resource2
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName() + " locked " + resource1);
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();
	}
}
