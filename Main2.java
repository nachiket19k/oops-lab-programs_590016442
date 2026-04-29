package package2;

import package1.Car;

class Main2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.mileage = 20;
        c.price = 800000;

        System.out.println(c.mileage);
        System.out.println(c.price);
    }
}
