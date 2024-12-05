package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerr {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amit", "Ajay", "Ashish", "Alok", "PhadSingh");

		StringJoiner st = new StringJoiner("-");

		for (String n : list) {
			st.add(n);
		}
	
		List<StringJoiner> collect = Stream.of(st).filter(x->x.length()%3==0||x.length()%4==0).collect(Collectors.toList());
		System.out.println(collect);
		
		String ss="Hi Good AfterNoon";
		Optional<String>empty=Optional.empty();
		System.out.println(empty);
		Optional<String>temp=Optional.of(ss);
		System.out.println(temp); 
	}
}
