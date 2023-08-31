package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0, second = 1;
		int num = 10;
		for (int i = 0; i <= num; i++) {
			System.out.print(first + ",");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
