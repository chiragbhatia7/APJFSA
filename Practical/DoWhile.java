import java.util.Scanner;

public class DoWhile {

    public void calcTable(int number) {
        int i = 10;
        do {
            System.out.println(number + " X " + i + " = " + number * i);
            i--;
        }
        while(i>0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = sc.nextInt();
        DoWhile dw = new DoWhile();
        dw.calcTable(number);
    }
}
