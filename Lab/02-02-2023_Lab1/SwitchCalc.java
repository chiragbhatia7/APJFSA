//Write a program to design a Calculator using switch case.

import java.util.Scanner;

public class SwitchCalc {

    public void calculator(int first_number, int second_number, int operation) {
        int result;
        switch (operation) {
            case 1:
                result = first_number + second_number;
                System.out.println(first_number + " + " + second_number + " = " + result);
                break;
            case 2:
                result = first_number - second_number;
                System.out.println(first_number + " - " + second_number + " = " + result);
                break;
            case 3:
                result = first_number * second_number;
                System.out.println(first_number + " * " + second_number + " = " + result);
                break;
            case 4:
                result = first_number / second_number;
                System.out.println(first_number + " / " + second_number + " = " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number associated with the operation you want to perform:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division ");
        int user_choice = sc.nextInt();
        System.out.println("Enter first number: ");
        int first_number = sc.nextInt();
        System.out.println("Enter second number: ");
        int second_number = sc.nextInt();
        SwitchCalc sc_object = new SwitchCalc();
        sc_object.calculator(first_number, second_number, user_choice);
        sc.close();
    }
}
