package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Part2 {
	public static void main(String[] args) {
		// Find max number in the list of integers
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		Integer max2 = numbers.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(max2);

		int asInt = numbers.stream().mapToInt(x -> x.intValue()).max().getAsInt();
		System.out.println(asInt);

		Integer m = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println(m);

		System.out.println("============================================");

		// How do you find the frequency of element in an array
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		Map<String, Long> collect = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " :  " + x.getValue()));

		System.out.println("============================================");
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		long sum2 = integers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		System.out.println(sum2);
		
		Integer sum3 = integers.stream().reduce(0,Integer::sum);
		System.out.println(sum3);
		
		
		
	}
}
