import java.util.Scanner;

public class Patterns {
    public void pattern(int input) {
        for (int i = 1; i <= input; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("  ");
        }
    }

    public static void main(String[] args) {
        Patterns obj = new Patterns();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        obj.pattern(input);
    }
}
