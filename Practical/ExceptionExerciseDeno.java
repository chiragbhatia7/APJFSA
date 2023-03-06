package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExerciseDeno {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the value of x: ");
			int x = scanner.nextInt();
			System.out.println("Enter the value of y: ");
			int y = scanner.nextInt();
			int result = x / y;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero.");
		} catch (InputMismatchException e) {
			System.out.println("Entered values need to be integers.");
		}

	}
}
