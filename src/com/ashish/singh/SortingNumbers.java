package com.ashish.singh;

import java.util.Arrays;
import java.util.List;

public class SortingNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 0);
		Integer integer = list.stream().max(Integer::compare).get();
		System.out.println(integer);
	}
}
