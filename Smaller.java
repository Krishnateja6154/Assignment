package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int[] arr = { 30, 26, 89, 76, 10 };

		int min = arr[0];

		for (int val : arr) {
			if (min > val) {
				min = val;
			}
		}
		System.out.println(min);
	}

}
