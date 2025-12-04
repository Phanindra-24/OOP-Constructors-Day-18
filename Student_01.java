package com.codegnan.oopexamples;

import java.util.Scanner;

public class Student_01 {
	String name;
	int rollNumber;
	int grade;
	
	public Student_01(String name,int rollNumber,int grade) {
	if (name.equals("null") || name.trim().isEmpty()) {
		System.out.println("Name cannot be empty or null");
	}
	if (rollNumber <= 0) {
		System.out.println("Roll Must be Positive");
	}
	if (grade < 1 || grade >12) {
		System.out.println("Grade level Must be Between 1 -12");
	}
	this.name = name;
	this.rollNumber = rollNumber;
	this.grade = grade;
	}
	public String showProfile() {
		return "Name :" +name+",Roll Number:"+rollNumber+"Grade:"+grade;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int roll = scanner.nextInt();
		int grade = scanner.nextInt();
		Student_01 s1 = new Student_01(name,roll,grade);
		System.out.println(s1.showProfile());
		scanner.close();
	}
	

}
