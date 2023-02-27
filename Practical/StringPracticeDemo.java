package Strings;

import java.util.Scanner;

public class StringPracticeDemo {

	public static void stringAandB(String a, String b) {
		System.out.println("Sum of lengths of the two words are: " + (a.length() + b.length()));
		int order = b.compareTo(a);
		if (order < 0) {
			System.out.println(a + " comes after " + b);
		}
		else if (order > 0) {
			System.out.println(b + " comes after " + a);
		}
		else {
			System.out.println(a + " and " + b +" are the same words");
		}
		String firstLetterOfA = a.substring(0, 1);
		String firstLetterOfB = b.substring(0, 1);
		String joinString = firstLetterOfA.toUpperCase() + a.substring(1) + " " + firstLetterOfB.toUpperCase() + b.substring(1);
		System.out.println(joinString);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first word: \n");
		String a = scanner.nextLine();
		System.out.println("Enter second word: \n");
		String b = scanner.nextLine();
		stringAandB(a, b);
		scanner.close();
	}
}
