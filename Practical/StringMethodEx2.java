package Strings;

public class StringMethodEx2 {
	public static void main(String[] args) {
		String a1 = "Anudip";
		String a2 = "Anudip Foundation Vashi";
		String a3 = "anudip";
		String a4 = "Anudip";

		// equals() compares values of string
		System.out.println(a1.equals(a2)); // false
		System.out.println(a1.equals(a3)); // false, coz of case mismatch
		System.out.println(a1.equalsIgnoreCase(a3)); // true

		// ==conpares references not values
		System.out.println(a1 == a2); // false
		System.out.println(a1 == a4); // true

		// lexicographically
		String a5 = "apple";
		String a6 = "america";
		System.out.println(a6.compareTo(a5)); // negative
		System.out.println(a1.compareTo(a4)); // equal
		System.out.println(a2.compareTo(a1)); // positive

		// Concatenation
		System.out.println(a5 + " " + a6);
		System.out.println(60 + 70 + "my" + 80 + 90);
		System.out.println(a5.concat(a6));
		
		// String
		System.out.println(a2.substring(0,6));
		System.err.println(a2.substring(6));
		System.out.println(a2.substring(17));
	}

}
