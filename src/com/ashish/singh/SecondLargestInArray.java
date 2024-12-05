package com.ashish.singh;

import java.util.Arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 3, 5, 7, 8 };
		Arrays.sort(nums);
		int SecondLargest = nums[nums.length - 2];
		System.out.println(SecondLargest);
	}
}
