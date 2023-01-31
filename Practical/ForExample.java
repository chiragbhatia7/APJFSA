import java.util.Scanner;

public class ForExample {
    public void calcTable(int number) {
        for (int i = 1; i < 1000; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = sc.nextInt();
        ForExample fe = new ForExample();
        fe.calcTable(number);
    }
}
