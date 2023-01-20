class another_class {
    public static void display() { //Static method
        System.out.println("Hey");
    }
}

public class Main { //Start of the class with main
    public static void main(String[] args) { //Entry point
        System.out.println("Hello world!"); //Will print on the console
        another_class.display(); //Classname.mthodname
    }
} //End of class