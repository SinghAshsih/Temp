package com.basic;

public class ThreadState extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RUNNING STATE");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadState threadState = new ThreadState();
		System.out.println(threadState.getState()); // NEW
		threadState.start();
		System.out.println(threadState.getState()); // RUNNALBE
		Thread.sleep(100);
		threadState.join();
		System.out.println(threadState.getState());
	}
}
