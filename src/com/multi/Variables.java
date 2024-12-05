package com.multi;

public class Variables {
	int i;
	long l = 567l;
	static String name = "Ashish Singh";

	public static void main(String[] args) {
		int local = 45;
		Variables var = new Variables();
		System.out.println("i = " + var.i + " ,I am instance variable not initialize that why i got default value ");
		System.out.println("l = " + var.l + " , I am instance variable . ");
		System.out.println("Name = " + Variables.name + " , I am static variables ");
		System.out.println("local = " + local + " , I am local variables ");
	}
}
