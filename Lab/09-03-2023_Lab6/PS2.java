//Problem Statement 2:
//Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.
//
//1.    Adds the string ”- This is a sample program” to existing string and display it.
//
//2.    Inserts the string “Object” into the existing string at 21st postion and display it.
//
//3.    Reverses the entire string and displays it.
//
//4.    Replaces the word “Buffer” with “Builder” and display it.

// Package name
package Lab6;

//Class definition
public class PS2 {

	// Declaration of a private static StringBuffer variable called myBuffer
	private static StringBuffer myBuffer;

	// The main method, which executes the program and calls the different methods
	public static void main(String[] args) {

		// Call to the method createBuffer, which creates a new StringBuffer with a
		// given string value.
		createBuffer("This is StringBuffer");

		// Call to the method addString, which appends a string to the end of the
		// existing StringBuffer.
		addString("This is a sample program");

		// Call to the method insertString, which inserts a string at a specified
		// position within the existing StringBuffer.
		insertString("Object");

		// Call to the method reverseString, which reverses the characters in the
		// existing StringBuffer.
		reverseString(myBuffer);

		// Call to the method replaceString, which replaces a specified substring with
		// another substring in the existing StringBuffer.
		replaceString(myBuffer.reverse().toString());
	}

	// The replaceString method, which replaces a specified substring with another
	// substring in the existing StringBuffer.
	private static void replaceString(String myString) {
		System.out.println("Replacing the word Buffer with Builder: " + myString.replaceAll("Buffer", "Builder"));

	}

	// The reverseString method, which reverses the characters in the existing
	// StringBuffer.
	private static void reverseString(StringBuffer myBuffer2) {
		System.out.println("Reversed string: " + myBuffer2.reverse());

	}

	// The insertString method, which inserts a string at a specified position
	// within the existing StringBuffer.
	private static void insertString(String string) {
		System.out.println("Appending at 21st position: " + myBuffer.insert(21, string));

	}

	// The addString method, which appends a string to the end of the existing
	// StringBuffer.
	private static void addString(String string) {
		System.out.println(myBuffer.append(string));
	}

	// The createBuffer method, which creates a new StringBuffer with a given string
	// value.
	private static void createBuffer(String string) {
		myBuffer = new StringBuffer(string);
		System.out.println("Value of variable myBuffer: " + myBuffer);
	}
}