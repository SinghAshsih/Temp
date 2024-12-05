package com.oopps;

import java.io.FileNotFoundException;

public class Ploymorphism {
	public void sum(int a, int b)throws NullPointerException {
		int sum = a + b;
		System.out.println("Sum : " + sum);
	}

	protected void sum(float a, float b)throws FileNotFoundException {
		float sum = a + b;
		System.out.println("Sum : " + sum);
	}

	 void sum(int a, float b) {
		float sum = a + b;
		System.out.println("Sum : " + sum);
	}

	public void sum(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum : " + sum);
	}

	public void sum(float a, int b) {
		float sum = a + b;
		System.out.println("Sum : " + sum);
		Ploymorphism.main(12);
	}

	private static void main(int a) {
		System.out.println("Hello I am from main ");
	}

	public static void main(String[] args) throws FileNotFoundException {
		Ploymorphism p = new Ploymorphism();
		p.sum(12, 12);
		p.sum(12, 12, 12);
		p.sum(12.3f, 12.7f);
		p.sum(12.6f, 12);
		p.sum(12, 12.5f);

	}

}
