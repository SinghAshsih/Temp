package com.threads.method;

public class InteruptThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Thread is running ....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread is innurpted ." + e);

		}
	}

	public static void main(String[] args) {
		InteruptThread t1 = new InteruptThread();
		t1.start();
		t1.interrupt();
	}
}
