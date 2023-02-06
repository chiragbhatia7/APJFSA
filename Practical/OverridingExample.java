import javafx.scene.AmbientLight;

class Animal {
    public void eat() {
        System.out.println("Base class ; eating...");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Derived class ; Dog is eating");
    }
}

public class OverridingExample {

    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        d.eat();
        a.eat();
        Animal a1 = new Dog();
        a1.eat();
    }
}
