package com.asr;

import java.util.Scanner;

public class GradingSystem {
	public static int totalMarks(int math, int english, int science, int social, int hindi) {
		int total = math + english + science + social + hindi;
		System.out.println("Student got " + total + " out of 500");
		return total;
	}

	public static double percentage(double totalMarks) {
		double per = (totalMarks / 500) * 100;
		System.out.println("Percentage is " + per);
		return per;
	}

	public static void grade(double percentage) {
		if (percentage > 90 && percentage <= 100) {
			System.out.println("GRADE : A");
		} else if (percentage > 75 && percentage <= 90) {
			System.out.println("GRADE : B");
		} else if (percentage > 60 && percentage <= 75) {
			System.out.println("GRADE : C");
		} else if (percentage > 33 && percentage <= 60) {
			System.out.println("GRADE : D");
		} else {
			System.out.println("Fail : You have to work hard ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks obrained in Math out of 100 ");
		int math = sc.nextInt();
		System.out.println("Enter marks obrained in English out of 100 ");
		int english = sc.nextInt();
		System.out.println("Enter marks obrained in Science out of 100 ");
		int science = sc.nextInt();
		System.out.println("Enter marks obrained in Social out of 100 ");
		int social = sc.nextInt();
		System.out.println("Enter marks obrained in Hindi out of 100 ");
		int hindi = sc.nextInt();

		int totalMarks = totalMarks(math, english, science, social, hindi);
		double percentage = percentage(totalMarks);
		grade(percentage);

		sc.close();
	}
}
