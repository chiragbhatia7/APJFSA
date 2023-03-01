package Strings;

class student {// defines a class student
	// declaring 2 instance variables with no value assigned
	int id;
	String name;

//	creating a parameterized constructor which sets value to instance variables
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	overriding  the method toString() to return value of both instance variable
	@Override
	public String toString() {
		return id + " " + name;
	}

}

public class ToStringExample {// class with main()

	public static void main(String[] args) {
//		creating objects of class students 
		student s1 = new student(1, "chirag");
		student s2 = new student(2, "kartik");
//		printing the objects with sopl
		System.out.println(s1);
		System.out.println(s2);
	}

}