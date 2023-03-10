package Regex;

import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		boolean b = Pattern.matches("[a-z1-9]{5,}", "hello2");
		System.out.println(b);
		b = Pattern.matches("[a-z1-9]{5,}", "Hel");
		System.out.println(b);
	}
}
