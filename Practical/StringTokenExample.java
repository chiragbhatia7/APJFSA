package Strings;

import java.util.StringTokenizer;

public class StringTokenExample {
	public static void main(String[] args) {
		StringTokenizer s1 = new StringTokenizer("this is string", " ");// Instantiating class StrinTokenizer and
																		// defining the object with a String
		while (s1.hasMoreTokens()) {// looping until s1 has tokens left after each iteration
			System.out.println(s1.nextToken());// printing each token

		}

	}
}
