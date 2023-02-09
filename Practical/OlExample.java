class CalcArea {
    public double area(double radius) {
        return (3.14 * radius * radius);
    }

    public double area(double length, double breath) {
        return (length * breath);
    }

    public double area(double side1, double side2, double height) {
        return (0.5 * (side1 + side2) * height);
    }

}

public class OlExample {
    public static void main(String[] args) {
        CalcArea ca = new CalcArea();
        System.out.println("Area of Circle: " + ca.area(3.5f));
        System.out.println("Area of Rectangle: " + ca.area(3.5f,6.7f));
        System.out.println("Area of Trapezium: " + ca.area(3.5f,5.5f,7.5f));
    }
}
