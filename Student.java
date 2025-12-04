package com.codegnan.oopexamples;

import java.util.Scanner;

public class Student {
int rollNumber;
String name;
	public Student(int rollNumber, String name) {
	super();
	this.rollNumber = rollNumber;
	this.name = name;
}

	public void display() {
		System.out.println("RollNumber:" + rollNumber);
		System.out.println("Name:" + name);
	
}
	public static void main(String[] argsS) {
		Scanner scanner = new Scanner(System.in);
		int rollNumber = scanner.nextInt();
		String name = scanner.next();
		Student s1 = new Student(rollNumber,name);
		s1.display();
		scanner.close();
	}
}
