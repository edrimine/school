package activity7;

import java.util.Scanner;

/**
 * Program: kohl_activity8
 * Author: Justin Kohl
 * Date: 10/20/2016
 * Purpose: Program takes user selection to get perimeter of triangle or rectangle. It then takes user input and prints the perimeter.
 *          Program checks for incorrect input
 */
public class Area {

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
                System.out.println("Invalid Selection");

        }
    }

    public static void rectangle(){
        System.out.println("width: ");
        int w = in.nextInt();
        System.out.println("height: ");
        int h = in.nextInt();

        System.out.println("area: " + (w*h));
    }

    public static void triangle(){
        System.out.println("base: ");
        int b = in.nextInt();
        System.out.println("height: ");
        int h = in.nextInt();

        System.out.println("area: " + (b*h/2));
    }
}
