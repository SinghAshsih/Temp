package com.threads.method;

public class SleepMethod extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000); // 3rd Method
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethod sleepMethod = new SleepMethod();
		sleepMethod.start();
	}
}
