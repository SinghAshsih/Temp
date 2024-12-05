package com.ashish.singh;

public class SwapString {
	public static void main(String[] args) {
		String s1 = "ashish";
		String s2 = "singh";
		System.out.println(" Before swaping : s1 = " + s1);
		System.out.println(" Before swaping : s2 = " + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length(), s1.length());

		System.out.println(" After  swaping : s1 = " + s1);
		System.out.println(" After  swaping : s2 = " + s2);
	}
}
