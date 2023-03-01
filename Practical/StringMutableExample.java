package Strings;

public class StringMutableExample {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is my String");// creating an instance
		System.out.println(s1.append(" Append"));
		System.out.println(s1.insert(3, "Insert"));
		System.out.println(s1.replace(0, 3, "Replace"));
		System.out.println(s1.delete(1, 3));
		System.out.println(s1.reverse());
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println();
		StringBuilder s2 = new StringBuilder("My name is Chirag");
		System.out.println(s2.append(" Append"));
		System.out.println(s2.insert(3, "Insert"));
		System.out.println(s2.replace(0, 3, "Replace"));
		System.out.println(s2.delete(1, 3));
		System.out.println(s2.reverse());
		System.out.println(s2.length());
		System.out.println(s2.charAt(3));

	}
}
