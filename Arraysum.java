import java.util.Scanner;

class Arraysum{
    public static void main(String[]args)
{
    int sum, sum_array=0;
    Scanner s = new Scanner(System.in);
    sum=s.nextInt();
    int arr[] = new int[5];
    for(int i=0;i<5;i++){
        arr[i]=s.nextInt();
        sum_array+= arr[i];
    }
    if(sum==sum_array){
        System.out.println("Yes,Sum of array is equal to the sum");
    }
    else{
        System.out.println("No it is not equal");
    }

}
}