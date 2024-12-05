package com.asr;

import java.util.Scanner;

public class VowelsAndConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next(".").toUpperCase().charAt(0);
		System.out.println(ch);
		vowelsAndConsonant(ch);
		sc.close();
	}

	private static void vowelsAndConsonant(char ch) {
		// TODO Auto-generated method stub
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;

		}
	}
}
