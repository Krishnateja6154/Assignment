package com.training.basic;

public class Even {

	public static void main(String[] args) {
		for (int num = 2; num <= 20; num++) {
			if (num % 2 == 0) {
				System.out.print(num + ",");
			}
		}
	}

}
