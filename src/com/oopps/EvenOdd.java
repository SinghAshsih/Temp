package com.oopps;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("Num is even : " + num);
		} else {
			System.out.println("Num is odd : " + num);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		evenOdd(num);
	}
}
