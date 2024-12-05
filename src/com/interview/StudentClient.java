package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentClient {
	// All the departments with at least two students

	public static void main(String[] args) {
		// Sample data for departments
		List<Department> departmentList = new ArrayList<>();
		departmentList.add(new Department(1, "Maths"));
		departmentList.add(new Department(2, "Science"));
		departmentList.add(new Department(3, "History"));
		departmentList.add(new Department(4, "Computer"));
		departmentList.add(new Department(5, "Economics"));
		departmentList.add(new Department(6, "Sanskrit"));
		// Sample data for students with their department IDs
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Ashish", List.of(1))); // Ashish is in Maths and Science
		studentList.add(new Student(2, "Deepa", List.of(2, 3, 4, 5))); // Deepa is in , Science ,History
																		// ,Computer ,Economics

		studentList.add(new Student(3, "Gaurav", List.of(2, 3))); // Gaurav is in Science and History
		studentList.add(new Student(4, "Abhishek", List.of(2, 3))); // Abhishek is in Science and History
		studentList.add(new Student(5, "Alok", List.of(3, 4, 5))); // Alok is in Math , Science ,Economics
		studentList.add(new Student(6, "Phad", List.of(4, 5))); // Phad is in Math and computer
		studentList.add(new Student(7, "Pawan", List.of(3))); // Pawan is in History and Economics
		studentList.add(new Student(8, "Deepak", List.of(2, 4))); // Deepak is in math

		// Q. All the departments with at least two students

		// Step 1: Create a map with department ID as the key and count of students as
		// the value
		Map<Integer, Long> departmentCounts = studentList.stream().flatMap(student -> student.getDeptIds().stream())
				.collect(Collectors.groupingBy(deptId -> deptId, Collectors.counting()));
		System.out.println(departmentCounts);

		// Step 2: Filter departments with at least two students
		List<Department> departmentsWithTwoOrMoreStudents = departmentList.stream()
				.filter(dept -> departmentCounts.getOrDefault(dept.departmentId, 0L) >= 2).collect(Collectors.toList());

		// Output the department names that have at least two students
		System.out.println("Departments with at least two students:");
		departmentsWithTwoOrMoreStudents.forEach(dept -> System.out.println(dept.getDeptName()));

	}
}
