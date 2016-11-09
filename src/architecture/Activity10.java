package architecture;

import java.util.Scanner;

/**
 * Created by Justin Kohl on 11/8/2016.
 * Purpose: Activity10.java takes used input of miles travelled and gallons used to calculate the mpg. It
 *          loops until user enters a sentinel value. At the end it calculates and displays the average mpg
 *          for all trips.
 */
public class Activity10 {
    public static void main(String[] args) {
        double milesTravelled = 1;
        double gallonsUsed = 0;
        double totalMPG = 0;
        double mpg;
        double avgMPG;
        int numOfTrips = 0;
        Scanner in = new Scanner(System.in);

        while (milesTravelled != 0) {
            System.out.println("Enter number of miles travelled (0 to exit): ");
            milesTravelled = in.nextDouble();

            System.out.println("Enter number of gallons used: ");
            gallonsUsed = in.nextDouble();

            if (milesTravelled < 0 || gallonsUsed < 0){
                System.out.println("Invalid input.");
            }
            else if(milesTravelled == 0){
                System.out.println("Exiting...");
            }
            else {
                numOfTrips++;
                mpg = calcMPG(milesTravelled, gallonsUsed);
                totalMPG += mpg;
                System.out.printf("For %.1f mi and %.1f gal, mpg is %f%n%n", milesTravelled, gallonsUsed, mpg);
            }
        }

        if (numOfTrips>0) {
            avgMPG = avgMPG(totalMPG, numOfTrips);
            System.out.println("The average mpg is " + avgMPG);
        }
    }

    /**
     * calcMPG takes miles and gallons as inputs and returns the mpg.
     * @param miles
     * @param gallons
     * @return mpg
     */
    public static double calcMPG(double miles, double gallons){
        double mpg = miles/gallons;
        return mpg;
    }

    /**
     * avgMPG takes the total mpg and number of trips as inputs and returns the average mpg
     * @param totalMPG
     * @param numOfTrips
     * @return avgMPG
     */
    public static double avgMPG(double totalMPG, int numOfTrips){
        double avgMPG = totalMPG/numOfTrips;
        return avgMPG;
    }
}
