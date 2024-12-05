package com.basic;

public class LambdaExpression {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Hello");
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
