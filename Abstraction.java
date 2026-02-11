abstract class sample {

    abstract void show();

    int a = 10;

    void display() {
        System.out.println(a);
    }
}

class child extends sample {

    
    // @Override
    void show1() {
        System.out.println("This is the implementation of the abstract method show() in the child class.");
    }
    void show() {
        System.out.println("This is the implementation of the abstract method show() in the child class.");
    }

}

public class Abstraction {

    public static void main(String[] args) {

        child c = new child();

        c.display();
        c.show1();
        c.show();
    }
}