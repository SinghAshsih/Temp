package com.gfgs;

import java.util.Scanner;

public class GreatestAmongThree {
	public void findGreatest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the greatest .");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println(num2 + " is the greatest .");
		} else {
			System.out.println(num3 + " is the greatest .");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		GreatestAmongThree greatestAmongThree = new GreatestAmongThree();
		greatestAmongThree.findGreatest(num1, num2, num3);
	}
}
