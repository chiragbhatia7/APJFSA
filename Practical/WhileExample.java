import java.util.Scanner;

public class WhileExample {
    public void calcTable(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + number * i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = sc.nextInt();
        WhileExample we = new WhileExample();
        we.calcTable(number);
    }
}
