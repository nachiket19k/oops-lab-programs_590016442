class A {
    int a;
}

public class Staticvariable {
    static int n;

    public static void main(String[] args) {
        A obj = new A();
        obj.a = 10;
        n = obj.a;
        System.out.println("Value of n: " + n);
    }
}
