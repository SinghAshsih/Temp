package com.asr;

interface Sum {
	public abstract void sum(int a, int b);
}

public class Test {

	public static void main(String[] arg) {
		boolean flag = true;
		for (int i = 1; i <= 100; i++) {
			flag = true;
			if (i == 1) {
				continue;
			}
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
				}

			}
			if (flag != false) {
				System.out.println(i);
			}
		}

	}
}