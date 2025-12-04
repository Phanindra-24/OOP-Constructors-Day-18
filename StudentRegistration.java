package com.codegnan.oopexamples;

import java.util.Scanner;

public class StudentRegistration {
	private String name;
	private int rollNumber;
	private int grade;
	
	
	public StudentRegistration(String name, int rollNumber, int grade) throws Exception{
		if(name == null || name.trim().isEmpty()) {
            throw new Exception("Error: Name cannot be empty  or null");
		}
		if(rollNumber<=0) {
			throw new Exception("Error: roll number must be Positive");
		}
		if(grade < 1 || grade > 12) {
            throw new Exception("Error: Grade must be between 1 and 12");
		}
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	public String showProfile () {
       return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int roll = scanner.nextInt();
		int grade = scanner.nextInt();
		Student_01 s1 = new Student_01(name,roll,grade);
		System.out.println(s1.showProfile());
		scanner.close();
	}
	

}