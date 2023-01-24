import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UnaryExample {

    public void calcIncrement() {
        System.out.println("-------");
        int x = 10;
        System.out.println(x++); // print 10 x is now 11
        System.out.println(x++); // print 11 x is now 12
        System.out.println(++x); // print 13 x is now 13
        System.out.println(x++); // print 13 x is now 14
        System.out.println(x); // print 14
    }

    public void calcDecrement() {
        System.out.println("-------");
        int x = 10;
//        System.out.println(x--); // print 10 x is now 9
//        System.out.println(x--); // print 9 x is now 8
//        System.out.println(--x); // print 7 x is now 7
//        System.out.println(x--); // print 7 x is now 6
//        System.out.println(x); // print 6
        System.out.println(x--);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
    }

    public void comparisonOperator() {
        System.out.println("-------");
        int x = 14;
        int y = 6;
        System.out.println(y > x);
        System.out.println(y < x);
        System.out.println(y == x);
    }

    public void logicalOperator() {
        System.out.println("-------");
        int x = 14;
        int y = 6;
        System.out.println((y == x) && (x > x));
        System.out.println((y == x) || (x > x));
    }

    public void bitwiseOperator() {
        System.out.println("-------");
        int x = 6;
        int y = 5;
        System.out.println((x > y) && (x++ < y));
        System.out.println((x > y) & (x++ < y));
        System.out.println((x > y) | (x++ > y));
    }

    public void ternaryOperator() {
        System.out.println("-------");
        int a = 2;
        int b = 3;
        int c = (a < b) ? a : b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        UnaryExample id = new UnaryExample();
        id.calcIncrement();
        id.calcDecrement();
        id.comparisonOperator();
        id.logicalOperator();
        id.bitwiseOperator();
        id.ternaryOperator();
    }
}
