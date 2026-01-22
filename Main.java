import java.util.Scanner;

class Main {
    int n;
    int sum = 0;

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        m.n = s.nextInt();

        // Current logic (sum equals n)
        m.sum = m.n;
        System.out.println("Sum = " + m.sum);

        s.close();
    }
}

class Car {
    int modelYear;
    int mileage;

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.modelYear = 2020;
        c1.mileage = 15;

        c2.modelYear = 2022;
        c2.mileage = 18;

        System.out.println("Car 1 Year: " + c1.modelYear + ", Mileage: " + c1.mileage);
        System.out.println("Car 2 Year: " + c2.modelYear + ", Mileage: " + c2.mileage);
    }
}
