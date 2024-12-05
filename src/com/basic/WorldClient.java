package com.basic;

public class WorldClient {
	public static void main(String[] args) {
		World world = new World();
		world.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
