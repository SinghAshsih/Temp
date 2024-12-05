package com.multi;

public class Multithreading extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		Multithreading m = new Multithreading();
		m.start();

	}
}
