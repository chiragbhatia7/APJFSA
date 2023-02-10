abstract class Car {
    public abstract void run();

    public void startCar() {
        System.out.println("Starting engine...");
    }
}

class Honda extends Car {
    public void run() {
        System.out.println("Max speed of the car is 180 km/hr");
    }
}

public class AbstractClassExmple {
    public static void main(String[] args) {
        Honda city = new Honda();
        city.startCar();
        city.run();
    }
}
