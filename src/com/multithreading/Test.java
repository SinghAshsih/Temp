package com.multithreading;

public class Test {
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 3, 5, 0 };
		// output=1,1,3,5,0,0,0

		int index = 0;
		int length = nums.length;

		System.out.println("Before");
		for (int i : nums) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}

		while (index < length) {
			nums[index] = 0;
			index++;
		}

		System.out.println("\nAfter");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
