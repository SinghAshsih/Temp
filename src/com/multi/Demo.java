package com.multi;

public class Demo {
	public static void main(String[] args) {
		int i = 5;
		// int to string
		String str = Integer.toString(i);
		System.out.println(str);
		
		long l=5l;
		String str2 = Long.toString(l);
		System.out.println(str2);
		
		// String to int 
		String s="5";
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
	}
}
