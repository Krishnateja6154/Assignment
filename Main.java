package com.objects.basics;

public class Main {

	public static void main(String[] args) {
		Book book1=new Book("Kushi","Vijay",600);
		book1.getDetails();
		book1.checkBook();
		System.out.println();
		Book book2=new Book("Mr&Mrs","Navin",400);
		book2.getDetails();
		book2.checkBook();
	}

}
