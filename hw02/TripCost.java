/**
 * TripCost.java
 * Computer Science 111, Boston University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: Calvin Yung cyung20@bu.edu
 * 
 * This program computes the cost of a trip, based on
 * the relevant values.
 */

import java.util.*;

public class TripCost {
    public static void main(String[] args) {
        int gasPrice;       // price of a gallon of gas in cents
        int epaRating;      // EPA mileage rating
        int distance;       // distance travelled to the nearest mile
        
        // Read the values from the user.
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the gas price in cents: ");
        gasPrice = console.nextInt();
        System.out.print("Enter the car's EPA mileage rating: ");
        epaRating = console.nextInt();
        System.out.print("Enter the distance travelled (to the nearest mile): ");
        distance = console.nextInt();
        
        /*
         * The lines above read the gas price, EPA rating, and distance 
         * from the user and store them in variables.
         * Fill in the rest of the program below, using those
         * variables to compute and print the cost of the trip,
         * as specified in the assignment.
         */
        
        double cost;
        cost = (gasPrice * distance / 100.0 / epaRating);
        double change;
        change = cost - (gasPrice * distance / 100 / epaRating);
        int total = (gasPrice * distance / 100 / epaRating);
        if (change != 0) {
            System.out.printf("The cost of the trip is: $" + "%.2f" , cost);
        } else {
            System.out.println("The cost of the trip is: $" + total);
        }
        System.out.println();
    }
}