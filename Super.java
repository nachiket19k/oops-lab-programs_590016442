class A {
    A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    B() {
        super();
        super();  
    }
}

class Super {
    public static void main(String[] args) {
        B obj = new B();
    }
}
