//Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.
public class Program2 {

    public void printDivisibleBy5andGreaterThan40() {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i > 40) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Program2 p2 = new Program2();
        p2.printDivisibleBy5andGreaterThan40();
    }
}
