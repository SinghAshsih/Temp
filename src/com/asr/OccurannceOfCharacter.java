package com.asr;

import java.util.HashMap;
import java.util.Map;

public class OccurannceOfCharacter {
	public static void main(String[] args) {
		String input = "ashishsingh";
		java7(input);
	}

	private static void java7(String input) {
		// TODO Auto-generated method stub
		// char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			char local = ch[i];
			if (map.containsKey(local)) {
				map.put(local, map.get(local) + 1);
			} else {
				map.put(local, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "" + entry.getValue());
		}
	}

}
