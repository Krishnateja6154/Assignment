package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int num = 6;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		float avg = sum / num;
		System.out.println(avg);
	}

}
