package com.blueliner;

public class StudentClient {
	public static void main(String[] args) {
		Student st1 = new Student(101, "Ashish");
		Student st2 = new Student(102, "Alok");
		Student st3 = new Student(103, "Akansha");
		Student st4 = new Student(104, "Abhishek");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		st1 = new Student(107, "Amit");
		System.out.println(st1);

	}
}
