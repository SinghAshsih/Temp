package com.asr;

public class Print10To1 {
	public static void main(String[] args) {
		reverseCounting();
	}

	private static void reverseCounting() {
		// TODO Auto-generated method stub
		int limit = 10;
		while (limit > 0) {
			System.out.println(limit);
			limit--;
		}
	}
}
