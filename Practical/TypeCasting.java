public class TypeCasting {

    public static void main(String[] args) {
        // Widening
        int x = 890;
        long z = x; // automatically convert int to long
        System.out.println(x);
        System.out.println(z);
        double y = x; // automatically convert int to double
        System.out.println(y);

        // Narrowing
        double a = 879.45;
        int b = (int)a; // converting double to int
    }
}
