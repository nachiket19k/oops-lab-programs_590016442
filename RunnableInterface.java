import java.util.*;
class T1 {
    public void methodR(){
        for(int i =0 ;i<=5;i++){
            System.out.println(i);
        }
    }
}
class T2 extends T1 implements Runnable{
    public void run(){
                methodR();
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
    }
}



public class RunnableInterface {
    public static void main(String[] args) {
        T2 t = new T2();
        Thread t2 = new Thread(t);
        t2.start();
    }
}