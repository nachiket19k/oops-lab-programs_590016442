import java.util.Scanner;

class Insertion{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello Koder");

        int n;
         System.out.println("Enter the value of  n");
        n = s.nextInt();
        int [] arr = new int[n];

        
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("The value of n is: " + n);
        System.out.println("The first value is: " + args[0]);

        s.close();
    }
}