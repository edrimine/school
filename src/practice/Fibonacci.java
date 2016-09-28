package practice;

/**
 * Created by Justin on 9/28/2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println(i+":\t"+fib(i));
        }

    }

    public static int fib(int x){
        if (x==1 || x==2){
            return 1;
        }
        else {
            return fib(x-1) + fib (x-2);
        }
    }
}

