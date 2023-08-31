package com.objects.basics;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student("Teja", "CSE",1);
		stu.printDetails();
		System.out.println("The grade is "+stu.getGrades(90,90,100));
		System.out.println();
		
		Student stu1 = new Student("Krishna", "ECE",2);
		stu1.printDetails();
		System.out.println("The grade is "+stu1.getGrades(90,90,75));
		
		
	}

}
