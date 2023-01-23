public class VariableExample {
    static int num = 55; // static

    long num1 = 7654321; // instance

    public void display() { // non-static method
        char a = 'H'; // local
        double num2 = 45.355;
        System.out.println("Local variable value: " + a); // printing local variable
    }

    public static void calc() {
        double b = 99.34;
        double c = 45.23;
        double res = b * c;
        System.out.println("Result is: " + res);
    }
    public static void main(String[] args) {
        VariableExample obj = new VariableExample(); // object creation
        obj.display(); // invoke non-static method with object
        System.out.println("Instance variable value: " + obj.num1); // calling instance variable
        System.out.println("Static variable value: " + VariableExample.num); // calling static variable

    }
}
