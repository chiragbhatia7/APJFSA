import java.util.Scanner; //import Scanner class of util package

public class ConditionalStatements {

    public void calc(int a, int b) { //non-static method
        int x = a; //define and declare a variable
        int y = b;
        if (x > y) { //simple condition
            System.out.println("x is greater than y"); //true
        } else {
            System.out.println("x is not greater than y"); //false
        }
    }

    public void multipleConditions(int x) {
        int age = x;
        if (age < 16) {
            System.out.println("You are a minor. You are not eligible to work");
        } else {
            if (age > 18 && age < 60) {
                System.out.println("You are eligible to work");
            } else {
                System.out.println("You are not eligible to work as per govt. regulations");
            }
        }
    }

    public void findMax(int x, int y, int z) {
        int a = x;
        int b = y;
        int c = z;
        if (a > b) {
            if (a > c) {
                System.out.println("a is maximum");
            }
        } else if (b > c) {
            System.out.println("b is maximum");
        } else {
            System.out.println("c is maximum");
        }
    }


    public void calcMarks(int marks) {

        if ((marks >= 85) && (marks <= 100)) {
            System.out.println("Grade 'O'");
        } else if ((marks >= 75) && (marks <= 84)) {
            System.out.println("Grade 'A++'");
        } else if ((marks >= 56) && (marks <= 74)) {
            System.out.println("Grade 'A'");
        } else if ((marks <= 55) && (marks >= 45)) {
            System.out.println("Grade 'B'");
        } else if ((marks <= 44) && (marks >= 35)) {
            System.out.println("Grade 'C'");
        } else if ((marks <= 34) && (marks >= 0)) {
            System.out.println("Failed!!!");
        } else {
            System.out.println("Wrong input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creation of scanner object
//        System.out.println("Enter number 1: ");
//        int x = sc.nextInt();
//        System.out.println("Enter number 2: ");
//        int y = sc.nextInt();
//        System.out.println("Enter age: ");
//        int x = sc.nextInt();
//        System.out.println("Enter first number: ");
//        int x = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int y = sc.nextInt();
//        System.out.println("Enter third number: ");
//        int z = sc.nextInt();
        System.out.println("Enter marks obtained: ");
        int x = sc.nextInt();
        ConditionalStatements my_object = new ConditionalStatements(); //object creation
//        my_object.calc(x,y);
//        my_object.multipleConditions(x);
        my_object.calcMarks(x);
    }
}
