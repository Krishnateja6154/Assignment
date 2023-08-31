package com.training.basic;

public class Prime {

	public static void main(String[] args) {
		int num = 15;
		int count = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}

	}

}
