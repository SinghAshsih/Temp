package com.multi;

public class Calculator {
	public void sum() {
		int a = 45;
		int b = 54;
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}

	public static void subtract() {
		int a = 56;
		int b = 34;
		int sub = a - b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
	}

	public void multiply() {
		int a = 4;
		int b = 5;
		int product = a * b;
		System.out.println("Product of " + a + " and " + b + " is " + product);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sum();
		calculator.multiply();
		Calculator.subtract();

	}
}
