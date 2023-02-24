package Strings;

public class StringMethodEx {
	public static void main(String[] args) {
		String a = "Anudip Foundation";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("Anu"));
		System.out.println(a.endsWith("tion"));
		System.out.println(a.charAt(6));
		System.out.println(a.length());
		System.out.println(a.replace("Anudip", "Anudeep"));
		
		int num = 55;
		String b = String.valueOf(num);
		System.out.println(b+55);
		
	}
}
