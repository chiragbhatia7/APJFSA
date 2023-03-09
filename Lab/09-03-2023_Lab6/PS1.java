//Problem Statement 1:
//Write a program which creates a String “Welcome to Java World” and performs the following
//
//·         Returns the character at 5th position and display it.
//
//·         Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
//
//·         Concatenates “- Let us learn” to the above string and display it.
//
//·         Returns the position of the first occurrence of character ‘a’ and display it.
//
//·         Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
//
//·         Returns string between 4th position and 10th position and display it.
//
//·         Returns the lowercase of the string and display it.
//
// 
//

// Package name
package Lab6;

// Class definition
public class PS1 {

	// Declaring a static variable myString of type String
	private static String myString;

	// Main method
	public static void main(String[] args) {
		// Call createString method with argument "Welcome to Java World"
		createString("Welcome to Java World");

		// Call return5th method with argument myString
		return5th(myString);

		// Call compareString method with argument myString
		compareString(myString);

		// Call concatenateString method with argument "- Let us learn"
		concatenateString("- Let us learn");

		// Call firstOccOfa method with argument myString
		firstOccOfa(myString);

		// Call replaceWithE method with argument myString
		replaceWithE(myString);

		// Call returnBW4thAnd10th method with argument myString
		returnBW4thAnd10th(myString);

		// Call returnLower method with argument myString
		returnLower(myString);
	}

	// Method to create a string and assign it to myString variable
	private static void createString(String string) {
		myString = new String(string);
		System.out.println("Value of variable myString: " + myString);
	}

	// Method to print the character at the 5th position of a given string
	private static void return5th(String myString2) {
		System.out.println("Character at 5th position: " + myString2.charAt(5));
	}

	// Method to compare a given string with the word "Welcome"
	private static void compareString(String myString2) {
		// Compare myString2 with the word "Welcome" ignoring the case
		int order = myString2.compareToIgnoreCase("Welcome");

		// Check the result of the comparison and print the appropriate message
		if (order < 0) {
			System.out.println("Welcome comes after " + myString2);
		} else if (order > 0) {
			System.out.println(myString2 + " comes after welcome");
		} else {
			System.out.println(myString2 + " and welcome are the same words");
		}
	}

	// Method to concatenate a given string to myString variable
	private static void concatenateString(String string) {
		System.out.println(myString + " " + string);
	}

	// Method to print the position of the first occurrence of character 'a' in a
	// given string
	private static void firstOccOfa(String myString2) {
		System.out.println("Position of the first occurrence of character 'a': " + myString2.indexOf("a"));
	}

	// Method to replace all occurrences of 'a' characters with 'e' characters in a
	// given string
	private static void replaceWithE(String myString2) {
		System.out.println("After replacing all 'a' characters with 'e' characters: " + myString2.replace('a', 'e'));
	}

	// Method to print the substring between the 4th and 10th position of a given
	// string
	private static void returnBW4thAnd10th(String myString2) {
		System.out.println("String between 4th position and 10th position: " + myString2.substring(3, 10));
	}

	// Method to print the lowercase version of a given string
	private static void returnLower(String myString2) {
		System.out.println("String in lower case: " + myString2.toLowerCase());
	}
}
