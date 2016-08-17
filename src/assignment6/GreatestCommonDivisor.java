package assignment6;

/**
 * Created by Justin on 4/26/2016.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(25,15));
        System.out.println(gcd(40,10));
        System.out.println(gcd(123,19));
        System.out.println(gcd(2500,680));
        System.out.println(gcd(92,70));
    }

    public static int gcd(int int1, int int2){
        double x = (double)int1;
        double y = (double)int2;

        return (int)gcdHelper(x,y);
    }

    public static double gcdHelper(double x, double y){
        if (y==0.0){
            return x;
        }
        else {
            return gcdHelper(y,x%y);
        }
    }
}
