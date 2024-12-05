package com.ashish.singh;

public class DeadLockAndRaceCondition {
	int count = 0;

	public void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		DeadLockAndRaceCondition d = new DeadLockAndRaceCondition();
		Runnable r1 = () -> {
			for (int i = 1; i <= 1000; i++) {
				d.increment();
			}
		};

		Runnable r2 = () -> {
			for (int i = 1; i <= 1000; i++) {
				d.increment();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Count : " + d.count);
	}
}
