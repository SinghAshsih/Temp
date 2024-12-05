package com.threads.method;

public class JoinMethod extends Thread {
	@Override
	public void run() {

		try {
			Thread.sleep(5000); // 3rd Method
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethod joinMethod = new JoinMethod();
		joinMethod.start();
		joinMethod.join();
		System.out.println("Hello");
	}
}
