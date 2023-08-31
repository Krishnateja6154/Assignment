package com.training.basic;

public class Reverse {

	public static void main(String[] args) {
		int num=12345;
		int rev = 0;
		while(num>0)
		{
			int lastDigit=num%10;
			num=num/10;
			rev=rev*10+lastDigit;
		}
		System.out.println(rev);
	}

}
