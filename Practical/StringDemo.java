package Strings;

public class StringDemo {

	public static void stringLiteralAndObject() {
		char[] name = {'C','h','i','r','a','g'};
		System.out.println(name);
		String s = new String(name);
		System.out.println(s);
		String name1 = "Chirag";
		System.out.println(name1);
	}

	public static void main(String[] args) {
		stringLiteralAndObject();
	}

}
