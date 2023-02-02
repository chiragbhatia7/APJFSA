//Write a program to print an diamond star pattern using loop
// *
// **
//****
// **
// *

import java.util.Scanner;

public class Pattern1 {

    public void printPattern(int row, int space) {
        int i, j;

        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print:\n");
        row = sc.nextInt();
        space = row - 1;
        Pattern1 p1 = new Pattern1();
        p1.printPattern(row, space);
    }
}
