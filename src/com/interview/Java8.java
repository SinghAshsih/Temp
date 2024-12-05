package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8 {
	static List<Employee> employeeList = new ArrayList<Employee>();

	static {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

	}

	public static void main(String[] args) {

		// Q3.0 Find the second highest salary for an employee with name

		Employee employee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.skip(1).findFirst().get();
		System.out.println(employee.getName() + "   " + employee.getSalary());

		// Query 3.1 : How many male and female employees are there in the organization?
//		long male = employeeList.stream().filter(x -> x.getGender().contains("Male")).count();
//		System.out.println("Male   : " + male);
//
//		long female = employeeList.stream().filter(x -> x.getGender().contains("Female")).count();
//		System.out.println("Female : " + female);
//
//		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
//				.forEach(System.out::println);

//		// Query 3.2 : Print the name of all departments in the organization?
//		employeeList.stream().map(x -> x.getDepartment()).distinct().forEach(System.out::println);

		/*
		 * // Query 3.3 : What is the average age of male and female employees?
		 * employeeList.stream() .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge)))
		 * .entrySet().forEach(System.out::println);
		 */

		// Query 3.4 : Get the details of highest paid employee in the organization?

		/*
		 * Employee employee =
		 * employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).
		 * get(); System.out.println(employee);
		 * 
		 * Employee employee2 =
		 * employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(
		 * Employee::getSalary))).get(); System.out.println(employee2);
		 */

//
//		// Query 3.5 : Get the names of all employees who have joined after 2015?
//
//		employeeList.stream().filter(x -> x.getDateOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

		// Query 3.6 : Count the number of employees in each department?
		/*
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.counting())).entrySet() .forEach(System.out::println);
		 */

		// Query 3.7 : What is the average salary of each department?
//		employeeList.stream()
//				.collect(
//						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
//				.entrySet().forEach(System.out::println);

		// Query 3.8 : Get the details of youngest male employee in the product
		// development department?
//
//		Optional<Employee> min = employeeList.stream()
//				.filter(x -> x.getDepartment().equals("Product Development") && x.getGender().equals("Male"))
//				.min(Comparator.comparingInt(Employee::getAge));
//		System.out.println(min.get());
//		
//		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper2 = employeeList.stream()
//
//				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
//
//				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
//
//		System.out.println(youngestMaleEmployeeInProductDevelopmentWrapper2);

		/*
		 * // Query 3.9 : Who has the most working experience in the organization?
		 * 
		 * Optional<Employee> map =
		 * employeeList.stream().min(Comparator.comparingInt(Employee::getDateOfJoining)
		 * ); System.out.println(map.get());
		 * 
		 * Employee employee =
		 * employeeList.stream().sorted(Comparator.comparingInt(Employee::
		 * getDateOfJoining)).findFirst().get(); System.out.println(employee);
		 */

		/*
		 * // Query 3.10 : How many male and female employees are there in the sales and
		 * // marketing team? employeeList.stream().filter(x ->
		 * x.getDepartment().equals("Sales And Marketing"))
		 * .collect(Collectors.groupingBy(Employee::getGender)).entrySet().forEach(
		 * System.out::println);
		 */

		/*
		 * // Query 3.11 : What is the average salary of male and female employees?
		 * employeeList.stream() .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingDouble(Employee::getSalary)))
		 * .entrySet().forEach(System.out::println);
		 */

		/*
		 * // Query 3.12 : List down the names of all employees in each department?
		 * 
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
		 * .entrySet() .forEach(x -> System.out.println(x.getKey() + " : " +
		 * x.getValue()));
		 */

		// What is the average salary and total salary of the whole organization?

//		DoubleSummaryStatistics statistics = employeeList.stream()
//				.collect(Collectors.summarizingDouble(Employee::getSalary));
//		System.out.println(statistics.getSum());
//		System.out.println(statistics.getAverage());

		/*
		 * // Query 3.14 : Separate the employees who are younger or equal to 25 years
		 * from // those employees who are older than 25 years.
		 * 
		 * employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() >=
		 * 25)).entrySet() .forEach(System.out::println);
		 */

		/*
		 * // Query 3.15 : Who is the oldest employee in the organization? What is his
		 * age
		 * 
		 * // and which department he belongs to?
		 * 
		 * Optional<Employee> max =
		 * employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		 * System.out.println(max.get().getName() + " : " + max.get().getAge() + " : " +
		 * max.get().getDepartment());
		 * 
		 * employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).
		 * ifPresent(System.out::println);
		 */

	}
}
