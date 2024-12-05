package com.threads.method;

public class YeildMethod extends Thread {
	public YeildMethod(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "  is running");
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		YeildMethod t1 = new YeildMethod("T1");
		YeildMethod t2 = new YeildMethod("T2");
		t1.start();
		t2.start();
	}
}
