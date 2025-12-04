package com.codegnan.oopexamples;

import java.util.Scanner;

public class StudentRegistrationDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		  
          String name = scanner.nextLine();
          int roll = scanner.nextInt();
          int grade = scanner.nextInt();

		StudentRegistration sr = new StudentRegistration( name, roll, grade);
		sr.showProfile();
		} catch(Exception e) {
            System.out.println(e.getMessage());
		} finally {
            scanner.close();
		}
	}

}