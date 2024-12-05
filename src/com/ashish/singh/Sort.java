package com.ashish.singh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(1, 2, 9, 8, 6, 5, 4, 3, 5);
		 * System.out.println(list); Collections.sort(list); System.out.println(list);
		 * 
		 * // Customized sorting Comparator<Integer> comparator = (Integer i, Integer j)
		 * -> { if (j > i) { return 1; } else { return -1; } };
		 * 
		 * Collections.sort(list, comparator); System.out.println(list);
		 */
		List<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Deepa");
		list.add("Deepak");
		list.add("Deepu");
		list.add("Ashish");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		Comparator<String> com = (String i, String j) -> {

			if (j.charAt(0) > i.charAt(0)) {
				return 1;
			} else {
				return -1;
			}

		};
		Collections.sort(list, com);
		System.out.println(list);
	}
}
