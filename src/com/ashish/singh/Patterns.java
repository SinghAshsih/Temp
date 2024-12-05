package com.ashish.singh;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter pattern number from range 1-14" + "\n" + "\t" + "\t OR" + "\n"
				+ " Do you want to see some magic?, press 100");
		int pattern = sc.nextInt();

		if (pattern > 0) {
			System.out.println("Please enter the number of rows to print");
			int row = sc.nextInt();

			switch (pattern) {
			case 1:
				pattern1(row);
				break;
			case 2:
				pattern2(row);
				break;
			case 3:
				pattern3(row);
				break;
			case 4:
				pattern4(row);
				break;
			case 5:
				pattern5(row);
				break;
			case 6:
				pattern6(row);
				break;
			case 7:
				pattern7(row);
				break;
			case 8:
				pattern8(row);
				break;
			case 9:
				pattern9(row);
				break;
			case 10:
				pattern10(row);
				break;
			case 11:
				pattern11(row);
				break;
			case 12:
				pattern12(row);
				break;
			case 13:
				pattern13(row);
				break;
			case 14:
				pattern14(row);
				break;
			case 100:
				allPatternOnOneCall(row);
				break;

			}
		} else {
			System.out.println("Please enter a valid case...The cases range is 1-14");
		}
	}

// main end

	public static void pattern1(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}// end pattern1

	public static void pattern2(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
		System.out.println("-----------------------" + "\n");
	}// end pattern2

	public static void pattern3(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern4(int row) {
		int a = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern5(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern6(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 5; j >= (6 - i); j--) {
				System.out.print(j);

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern7(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = row; j >= i; j--) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern8(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = row; j >= i; j--) {
				if (i % 2 == 0 && j % 2 != 0) {

					System.out.print("0 ");
				} else if (i % 2 != 0 && j % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}

			}

			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}
// low facing patterns is started from here onwards

	public static void pattern9(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern10(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern14(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern13(int row) {

		for (int i = row; i > 0; i--) {
			for (int k = row; k > row - i + 1; k--) {
				System.out.print(" ");
			}
			for (int j = row; j >= i; j--) {

				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern12(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(j);

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void pattern11(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}
		System.out.println("-----------------------" + "\n");
	}

	public static void allPatternOnOneCall(int row) {
		System.out.println("Pattern1");
		pattern1(row);

		System.out.println("Pattern2");
		pattern2(row);

		System.out.println("Pattern3");
		pattern3(row);

		System.out.println("Pattern4");
		pattern4(row);

		System.out.println("Pattern5");
		pattern5(row);

		System.out.println("Pattern6");
		pattern6(row);

		System.out.println("Pattern7");
		pattern7(row);

		System.out.println("Pattern8");
		pattern8(row);

		System.out.println("Pattern9");
		pattern9(row);

		System.out.println("Pattern10");
		pattern10(row);

		System.out.println("Pattern11");
		pattern11(row);

		System.out.println("Pattern12");
		pattern12(row);

		System.out.println("Pattern13");
		pattern13(row);

		System.out.println("Pattern14");
		pattern14(row);

	}

} // class end
