package act8;

import java.util.Scanner;

/**
 * Program: kohl_activity8
 * Author: Justin Kohl
 * Date: 10/20/2016
 * Purpose: Program takes user selection to get perimeter of triangle or rectangle. It then takes user input and prints the perimeter.
 *          Program checks for incorrect input.
 */
public class kohl_activity8 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Get area of rectangle (1) or triangle (2): ");

        int choice = in.nextInt();
        switch (choice) {
            case 1:
                rectangle();
                break;
            case 2:
                triangle();
                break;
            default:
                System.out.println("Invalid Selection");        //If selection is not 1 or 2 let user know it is invalid.
        }
    }


    /**
     * Take user input for 2 sides and calculate perimeter.
     */
    public static void rectangle(){
        System.out.println("side 1: ");
        double s1 = in.nextInt();
        System.out.println("side 2: ");
        double s2 = in.nextInt();

        System.out.println("perimeter: " + ((s1*2)+(s2*2)));
    }

    /**
     * Take user input for all three sides and calculate perimeter.
     */
    public static void triangle(){
        System.out.println("side 1: ");
        double s1 = in.nextInt();
        System.out.println("side 2: ");
        double s2 = in.nextInt();
        System.out.println("side 3: ");
        double s3 = in.nextInt();

        System.out.println("perimeter: " + (s1+s2+s3));
    }
}
