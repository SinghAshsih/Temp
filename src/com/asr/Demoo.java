package com.asr;

import java.util.Arrays;

public class Demoo {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 0, 5, 3 };
		// output 1,1,5,3,0,0
		moveZerosToEnd(arr);

		// Output the modified array 
		System.out.println(Arrays.toString(arr));
	}

	public static void moveZerosToEnd(int[] arr) {
		int n = arr.length;
		int index = 0; // Index for placing non-zero elements

		// Traverse through all elements of the array
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i]; // Place non-zero elements at the correct index
			}
		}

		// After placing all non-zero elements, fill remaining positions with zero
		while (index < n) {
			arr[index++] = 0;
		}
	}
}
