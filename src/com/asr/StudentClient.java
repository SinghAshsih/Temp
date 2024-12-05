package com.asr;

public class StudentClient {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Ashish");
		Student s2 = new Student(102, "Abhishek");
		Student s3 = new Student(101, "Ashish");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());

	}
}
