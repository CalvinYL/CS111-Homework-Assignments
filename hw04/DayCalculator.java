/*
 * DayCalculator.java
 * 
 * A program that determines the day of the week of a given date.
 * 
 * Computer Science 111, Boston University
 *
 * modified by: Calvin Yung, cyung20@bu.edu
 */

import java.util.*;
public class DayCalculator {
    public static void main(String[] args) {
        // The components of the date.
        // You will modify these lines to read the values from the user.
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int month = console.nextInt();
        System.out.println("Enter the day: ");
        int day = console.nextInt();
        System.out.println("Enter the year: ");
        int year = console.nextInt();
        
        int x = dayNumber(month, day, year);
        String dayOfWeek = dayOfWeek(x); 
        System.out.print(month + "/" + day + "/" + year); 
        System.out.println(" falls on a " + dayOfWeek + ".");
   
    }
    
    // Determine the date's day-of-week-number.
    // This is the code that you will use as the basis
    // of your dayNumber() method.
    public static int dayNumber(int month, int day, int year) {
        int y = year - (14 - month)/12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12*((14 - month)/12) - 2;
        int dayNum = (day + x + (31*m)/12) % 7;
        return dayNum;
    }
        
        
        // Determine the date's day of the week.
        // This is the code that you will use as the basis
        // of your dayOfWeek() method.
        
    public static String dayOfWeek(int dayNum) {
        String dayOfWeek;
        if (dayNum == 0) {
            dayOfWeek = "Sunday";
        } else if (dayNum == 1) {
            dayOfWeek = "Monday";
        } else if (dayNum == 2) {
            dayOfWeek = "Tuesday";
        } else if (dayNum == 3) {
            dayOfWeek = "Wednesday";
        } else if (dayNum == 4) {
            dayOfWeek = "Thursday";
        } else if (dayNum == 5) {
            dayOfWeek = "Friday";
        } else {
            dayOfWeek = "Saturday";
        }
        
        return dayOfWeek;
        // Print the result.
        
        
    }
    
}