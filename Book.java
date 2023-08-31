package com.objects.basics;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getDetails()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
//		System.out.println(title);

	}
	void checkBook()
	{
		if(price>500)
		{
			System.out.println("Premium books");
		}
		else
		{
			System.out.println("Standard book");
		}
	}
	
}
