/**
 * LadderLength.java
 * Computer Science 111, Boston University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: Calvin Yung cyung20@bu.edu 
 * 
 * This program computes the necessary length of a ladder, given
 * the height of the point to be reached and the angle at which the
 * ladder will be positioned.
 */

import java.util.*;

public class LadderLength {
    public static void main(String[] args) {
        int height;     // the height to be reached in feet
        int angle;      // the angle at which the ladder will be positioned
        
        // Read the values from the user.
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the height to the nearest foot: ");
        height = console.nextInt();
        System.out.print("Enter the angle to the nearest degree: ");
        angle = console.nextInt();      
        
        /*
         * The lines above read the height and angle from the user
         * and store them in the variables height and angle.
         * Fill in the rest of the program below, using those
         * variables to compute and print the length of the ladder.
         */
        
        //System.out.printf("The cost of the trip is: $" + "%.2f" , cost);
    
        double radians;
        double yards;
        double feet;
        double remainderF; // remainder feet
        int remainderY; //remainder yards
        radians = (angle/180.0)*Math.PI; //conversion from degrees to radians
        feet = height / Math.sin(radians); //equation to find length of ladder (ft)
        yards = feet / 3;
        remainderY = (int)(feet / 3);
        remainderF = (yards - remainderY)*3;
            System.out.println("The required length is:");
            System.out.printf("%.15f" , feet);
            System.out.print(" feet");
            System.out.println();
            System.out.printf("%.15f" , yards);
            System.out.print(" yards");
            System.out.println();
            System.out.printf(remainderY + " yards and " + remainderF);
                if (feet == 1) {
                    System.out.print(" foot");    
                } else {
                    System.out.print(" feet");
                }
        if (yards == 1) {
            System.out.print(" yard");
        }    
        System.out.println();
        
    }
}
