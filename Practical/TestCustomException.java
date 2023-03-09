package Exception;

public class TestCustomException {

	static void checkAge(int age) throws VerificationException {
		if (age < 18 || age > 25) {
			throw new VerificationException("Student's age should be greater than 18 and less than 25");
		} else {
			System.out.println("Student is eligible for admission");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(30);
		} catch (VerificationException e) {
			System.out.println(e);
		}
	}
}
