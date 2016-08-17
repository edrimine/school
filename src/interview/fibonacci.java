package interview;

/**
 * Created by Justin on 3/12/2016.
 */
public class fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
        //fibToNumber(10);

    }

    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            System.out.println(1);
            return 1;
        }
        System.out.println(fibonacci(number-1) + fibonacci(number -2));
        return fibonacci(number-1) + fibonacci(number -2);
    }

    public static void fibToNumber(int toNumber) {
        for(int i=1; i<=toNumber; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }



}
