package com.asr;

//Main class
public class Diamond {

	// Main driver method
	public static void main(String[] args) {

		int rows = 6;
		int i, j;
		for (i = 1; i <= rows; i++) {

			for (j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		for (i = rows - 1; i > 0; i--) {

			for (j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}