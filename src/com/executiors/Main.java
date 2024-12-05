package com.executiors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService exector = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			final int k = i;
			exector.submit(() -> {

				long result = factorial(k);
				System.out.println(result);
			});
		}
		exector.shutdown();
	}

	private static long factorial(int k) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		return 0;
	}
}
