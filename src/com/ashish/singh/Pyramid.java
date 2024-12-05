package com.ashish.singh;

public class Pyramid {
	public static void main(String[] args) {
		int row = 9;
		for (int i = 1; i < row; i++) {

			for (int j = row - i; j > 1; j--) {
				if (i % 2 != 0) {
					System.out.print(" ");
				} else {
					break;
				}
			}

			for (int k = 1; k <= i; k++) {
				if (i % 2 != 0) {
					System.out.print("* ");
				} else {
					break;
				}
			}
			if (i % 2 != 0) {
				System.out.println();
			}
		}
	}
}
