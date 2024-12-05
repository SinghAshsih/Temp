package com.basic;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name :- " + threadName);
	}
}
