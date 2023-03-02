//Scenario: A kids laptop manufacturer needs to develop a laptop which will display a message first,
//Enter Option:
//
//Add-1
//
//Subtract-2
//
//Multiply-3
//
//Even/OddNumber -4
//
//Quit-5
//
//The kid should be allowed to enter an option. If the kid enters 1, a message needs to be displayed,
//
//“Enter two numbers to be added”.
//
//The kid should be allowed to enter two numbers (In two separate lines).
//
//Based on the numbers entered, the program should add and display the result as below
//
//“The result is <result>”
//
//After the result is displayed, the program should loop back and ask for the next menu entry. If the kid enters  5, the program should quit. (The program needs to be executed and do either one of the options  until the kid enters the option 5)
//
//Problem Statement:
//
//Create a class ScannerLaptopDemo.java with a main method which performs the required operations as specified above.
//
//Algorithm:
//1.    Display message as specified to print the various options 1 to 5.
//
//2.    On user enters one of the option based on the input the appropriate arithmetic operation is done as mentioned below.
//
//3.    Using switch statement, display the appropriate message.
//
//a.    Example if option is 1 “Enter two numbers to be added”, get the two numbers using Scanner class and print the added result.
//
//b.    If option is 2 “Enter two numbers to be subtracted”, get the two numbers using Scanner class and print the subtracted result.
//
//c.     If option is 3 “Enter two numbers to be multiplied”, get the two numbers using Scanner class and print the multiplied result.
//
//d.    If option is 4 “Enter numbers to check even or add”, get the number using Scanner class and print the result.
//
//e.    If option is 5 terminate the program.
//
// 
//
//4.     Perform step 1 to 4 in a do-while loop (while option != 5).

package Lab5;

import java.util.Scanner;

public class ScannerLaptopDemo {
    // Declare a static variable userInput to store the user input option
    static int userInput;

    public static void main(String[] args) {
        // Create a new Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu of options to the user and read the input until the user chooses to quit
        do {
            System.out.println("Enter Option: \nAdd - 1\nSubtract - 2\nMultiply - 3\nEven / Odd Number - 4\nQuit - 5");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    // If the user chooses option 1, prompt the user to enter two numbers and perform addition
                    System.out.println("Enter two numbers to be added: \n");
                    double firstNumber = Double.parseDouble(scanner.next());
                    double secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber + secondNumber));
                    break;
                case 2:
                    // If the user chooses option 2, prompt the user to enter two numbers and perform subtraction
                    System.out.println("Enter two numbers to be subtracted: \n");
                    firstNumber = Double.parseDouble(scanner.next());
                    secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber - secondNumber));
                    break;
                case 3:
                    // If the user chooses option 3, prompt the user to enter two numbers and perform multiplication
                    System.out.println("Enter two numbers to be multiplied: \n");
                    firstNumber = Double.parseDouble(scanner.next());
                    secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber * secondNumber));
                    break;
                case 4:
                    // If the user chooses option 4, prompt the user to enter a number and determine whether it's even or odd
                    System.out.println("Enter a number: \n");
                    double number = Double.parseDouble(scanner.next());
                    if (number % 2 == 0) {
                        System.out.println("The result is even.");
                    } else {
                        System.out.println("The result is odd.");
                    }
                    break;
                case 5:
                    // If the user chooses option 5, quit the program
                    System.out.println("Bye... :)");
                    break;
                default:
                    // If the user enters an invalid option, throw an exception with an error message
                    throw new IllegalArgumentException("Unexpected value: " + userInput);
            }
        } while (userInput != 5); // Continue looping until the user chooses to quit
    }
}
