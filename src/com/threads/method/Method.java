package com.threads.method;

public class Method extends Thread {
	@Override
	public void run() {                    // 2nd method
		System.out.println("2nd Method");
	}

	public static void main(String[] args) {
		Method method = new Method();
		method.start();       // 1st method
	}
}
