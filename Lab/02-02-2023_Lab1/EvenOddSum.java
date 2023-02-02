//Write a program to print even, odd, sum of natural number using for loop from 1-200

public class EvenOddSum {

    public void printEven() {
        System.out.println("List of Even numbers: ");
        for (int i = 1; i < 201; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printOdd() {
        System.out.println("List of Odd numbers: ");
        for (int i = 1; i < 201; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        System.out.println("Sum of natural numbers in the range of 1-200: ");
        int sum = 0;
        for (int i = 1; i < 201; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        EvenOddSum eos = new EvenOddSum();
        eos.printEven();
        eos.printOdd();
        eos.printSum();
    }
}
