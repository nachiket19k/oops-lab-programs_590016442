import java.util.Scanner;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class Employee {

    String name;
    int age;
    float salary;

    public Employee(String name, int age, float salary) throws InvalidDataException {

        if (name == null || name.length() > 20) {
            throw new InvalidDataException("Name must be within 20 characters.");
        }

        if (age <= 0) {
            throw new InvalidDataException("Age must be positive.");
        }

        if (salary <= 0) {
            throw new InvalidDataException("Salary must be positive.");
        }

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Salary: " + salary);
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            Employee emp = new Employee(name, age, salary);

            emp.display();
        }
        catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("The data inserted successfully.");
        }

        sc.close();
    }
}