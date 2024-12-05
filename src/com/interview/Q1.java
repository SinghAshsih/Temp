package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		/*
		 * // find only duplicate numbers List<Integer> numbers = Arrays.asList(new
		 * Integer[] { 1, 2, 1, 3, 4, 4 }); numbers.stream().filter(i ->
		 * Collections.frequency(numbers, i) > 1).collect(Collectors.toSet())
		 * .forEach(System.out::println);
		 * 
		 * // or IntStream.of(1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2).boxed()
		 * .collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())).entrySet() .forEach(System.out::println);
		 */

		/*
		 * //Sum number in a list
		 * 
		 * List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); int sum =
		 * integers.stream().mapToInt(Integer::intValue).sum(); System.out.println(sum);
		 * 
		 * Integer reduce = integers.stream().reduce(0,Integer::sum);
		 * System.out.println(reduce);
		 */

		/*
		 * // Find only duplicate numbers
		 * 
		 * List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 1, 3, 4, 4 });
		 * 
		 * numbers.stream().filter(x -> Collections.frequency(numbers, x) >
		 * 1).collect(Collectors.toSet()) .forEach(System.out::println); //OR
		 * 
		 * List<Integer> duplicates = IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
		 * 
		 * .boxed()
		 * 
		 * .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() )
		 * )
		 * 
		 * .entrySet()
		 * 
		 * .stream()
		 * 
		 * .filter( p -> p.getValue() > 1 )
		 * 
		 * .map( Map.Entry::getKey )
		 * 
		 * .collect( Collectors.toList() );
		 * 
		 * System.out.println(duplicates);
		 */

		/*
		 * // Find distinct numbers in an array int[] nums = { 1, 2, 3, 4, 5, 4, 3, 5,
		 * 3, 2, 4, 6, 7, 7 }; int[] array = Arrays.stream(nums).distinct().toArray();
		 * Arrays.stream(array).forEach(System.out::println);
		 */

		// Sort a map based on value

		Map<String, Integer> wordCounts = new HashMap<>();

		wordCounts.put("USA", 100);

		wordCounts.put("jobs", 200);

		wordCounts.put("software", 50);

		wordCounts.put("technology", 70);

		wordCounts.put("opportunity", 200);

		Map<String, Integer> collect = wordCounts.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(collect);

	}
}
