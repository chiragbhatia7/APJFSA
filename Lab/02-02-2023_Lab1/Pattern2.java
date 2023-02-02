//Write a program to print Left down alphabet triangle pattern using loop
//ABCDE
//ABCD
//ABC
//AB
//A
public class Pattern2 {
    public void printPattern() {
        int size = 5;
        int alpha = 65;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
                System.out.print((char) (alpha + j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 p2 = new Pattern2();
        p2.printPattern();
    }
}
