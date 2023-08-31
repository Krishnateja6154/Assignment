package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

	public static void main(String[] args) {
		int[] arr = { 90, 70, 10, 50, 40 };
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 2]);
	}

}
