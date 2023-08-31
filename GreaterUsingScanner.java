package com.training.scan;

import java.util.Scanner;

public class GreaterUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int num=sc.nextInt();
		System.out.println("Enter Second number:");
		int num1=sc.nextInt();
		System.out.println("Enter third number:");
		int num2=sc.nextInt();
		
		int result=(num>num1 && num>num2)?num:(num1>num2)?num1:num2;
		
		System.out.println(result);

	}

}
