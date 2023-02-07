interface Parent1 {
    void discipline();

}

interface Parent2 {
    void discipline();
}

class Child implements Parent1, Parent2 {


    public void discipline() {
        System.out.println("Disciplined by parents...");
    }

    public void follow() {
        System.out.println("Following all instructions...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.discipline();
        c.follow();
    }
}
