package com.multithreading;

public class Factorial {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		Thread[] threads = new Thread[9];
		for (int i = 1; i < 10; i++) {
			final int finalI = i;
			threads[i - 1] = new Thread(() -> {
				System.out.println(factorial(finalI));
			});
			threads[i - 1].start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Total time : " + (System.currentTimeMillis() - currentTimeMillis));
	}

	private static long factorial(int i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		long result = 1;
		for (int j = 1; j <= i; j++) {
			result = j * result;
		}
		return result;
	}
}
