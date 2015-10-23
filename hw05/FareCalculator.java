/*
 * FareCalculator.java
 * Calvin Yung (cyung20@bu.edu)
 * 10/23/2013
 * 
 * This program calculates how much a person's fare is depending
 * on his/her age, choice of transportation (bus or subway), and
 * if he/she uses a Charlie Card (if older than 18 but younger than 65).
 * For the commuter rail, the price is determined by a person's 
 * desired destination for travel as well as his/her age.
 */

import java.util.*;

public class FareCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the MBTA Fare Calculator!");
        
        int getRide = getRide(console);
        int age = getAge(console);

        if (age <= 11) {
            System.out.print("The fare is: no charge");
        } else {
            double fare = farePrice(getRide, age, console);
            System.out.printf("The fare is: $%.2f\n", fare);
        }
        System.out.println();
    }
    
    /*
     * This method calls on other methods to determine the price
     * of a ride based on the user's input.
     */
    public static double farePrice(int getRide, int age, Scanner console) {
        double fare;
        if (getRide == 1) {
            fare = busPrice(age, console);
        } else if (getRide == 2) {
            fare = subwayPrice(age, console);
        } else {
            fare = commuterPrice(age, console);
        }
        return fare;
    }
    
    /*
     * This method uses whatever the user inputs into the Scanner
     * as a parameter to determine what type of ride they would like.
     * This returns the number of whichever ride is chosen.
     */
    public static int getRide(Scanner console) {    
        System.out.println("Ride types:");                   
        System.out.println("1) Bus");
        System.out.println("2) Subway");
        System.out.println("3) Commuter Rail");
        System.out.println("Enter the type of ride (1-3)");
        int type = console.nextInt();
        return type;
    }
    
    /*
     * This method takes whatever number the user inputs into the 
     * Scanner as a parameter to determine how much his/her fare
     * will be. This returns the age.
     */
    public static int getAge(Scanner console) {
        System.out.print("Enter the age of the rider:");
        int age = console.nextInt();
        return age;
    }
    
    public static String getCharlieCard(Scanner console) {
        System.out.println("Is the rider using a Charlie Card (y/n)?");
        String card = console.next();
        return card;
    }
    
    /*
     * This method determines the price of a person taking the bus
     * based on his/her given age.
     */
    public static double busPrice(int age, Scanner console) { 
        double fare;
        if (age >= 12 && age <= 18 || age >= 65) {
            fare = 0.75;    
        } else {
            String charlieCard = getCharlieCard(console);
            if (charlieCard.equals("y")) {
                fare = 1.50;
            } else {
                fare = 2.00;
            } 
        }
        return fare;
    }
    
    /*
     * This method determines the price of a person taking the subway
     * based on his/her given age.
     */
    public static double subwayPrice(int age, Scanner console) {  
        double fare;
        if (age >= 12 && age <= 18 || age >= 65) {
            fare = 1.00;
        } else { 
            String charlieCard = getCharlieCard(console);
            if (charlieCard.equals("y")) {
                fare = 2.00;    
            } else {
                fare = 2.50;
            }  
        }
        return fare;
    }
    
    /*
     * This method takes the inputted zone number then calculates
     * and returns the cost of the fare.
     */
    public static int getZone(int zone) {
        int count = 0;
        int num = 1;
        int fare;
        while (num < zone) {
            num += 2;
            count++;
        }
        fare = 550 + (125 * count); 
        return fare;
    }
    
    /*
     * This method determines the price of a person taking the commuter
     * rail based on his/her given age.
     */
    public static double commuterPrice(int age, Scanner console) {
        System.out.println("what zone (use 0 for zone 1A)?");
        int zone = console.nextInt();
        double odd = (zone - 1) % 2;
        int fare;
        int zonePrice = getZone(zone);
        
        if (zone == 0) {
            fare = 200;
        } else if (odd == 0) {
            fare = zonePrice;
        } else {
            fare = zonePrice - 75;
        }
        if (age >= 65) {  
            fare = fare / 2;
        }
        double price = fare * 0.01;
        return price;
    }
}





