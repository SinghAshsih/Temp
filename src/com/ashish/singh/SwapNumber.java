package com.ashish.singh;

public class SwapNumber {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println(" Before swaping : A = " + a);
		System.out.println(" Before swaping : B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" After  swaping : A = " + a);
		System.out.println(" After  swaping : B = " + b);
	}
}
