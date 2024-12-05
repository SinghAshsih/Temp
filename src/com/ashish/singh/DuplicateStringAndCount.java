package com.ashish.singh;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringAndCount {
	public static void main(String[] args) {
		String name = "ashishsingh";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		map.entrySet().stream().filter(x -> x.getValue() > 1)
				.forEach(x -> System.out.println(x.getKey() + " -> " + x.getValue()));

	}
}
