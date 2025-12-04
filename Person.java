package com.codegnan.oopexamples;

public class Person {
	// instance variables(fields)
	private String name;
	private int age;
	private double height;
	
	// mutator methods
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age cannot be negative");
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		if (height > 0) {
			this.height =height;
		} else {
			System.out.println("Height must be positive");
		}
		
	} 
	public double getHeight() {
		return height;
	}
	
	// operators methods
	public void introduce() {
		System.out.println("Hello, My Name is:"+name+"iam"+age+"years old and "+height+" meters tall");
	}
	public boolean isAdult() {
		return age >= 18;
	}
	public void celebrateBirthday() {
		age++;
		System.out.println("Happy Birthday! "+name+"is now"+age+"years old");
	}
	// static 
	public static String getSpeciesName() {
		return "Homo spanies";
	}
	
	// static method : cannot be overidden by subclass.
	public final String getIndentification() {
		return name +","+age+"Years Old";
	}
}
