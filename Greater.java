package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] arr = { 90, 20, 30, 400, 50 };

		int max = arr[0];

		for (int val : arr) {
			if (max < val) {
				max = val;
			}
		}
		System.out.println(max);
	}

}
