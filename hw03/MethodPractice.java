/*
 * MethodPratice.java
 * By Calvin Yung (cyung20@bu.edu)
 * 10/01/2013
 * 
 * This program demonstrates the use of parameters in order
 * to create a stair case of a specific character and how to
 * return a value in a method to make computing problems easier.
 */

public class MethodPractice {
    /*
     * This method uses of parameters in order to produce a
     * specific character a certain amount of times.
     * The number of said character increases by one after each line
     * and the maximum output is determined by the final value 
     * inputted into numRows.
     */
    public static final int SCALE_FACTOR = 2;
    
    public static void printPattern(char ch, int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    /*
     * This method calculates the area of a triangle by taking
     * whatever values are inputted into base and height
     * and returning the result to replace the original 
     * statement (base * height / 2.0).
     */
    public static double triangleArea(int base, int height) {
        double area;
        return area = base * height / 2.0;
    }
    /*
     * The main method calls both the printPattern and triangleArea
     * methods with predetermined values to test to see if they work.
     */
    public static void main(String[] args) {       
        printPattern('#', 4);
        System.out.println();
        printPattern('@', 7);
        System.out.println();
        
        int base = 10;
        int height = 6;
        System.out.println("area1 = " + triangleArea(base, height));
        System.out.println("area2 = " + triangleArea(7, 3));
        
        /*
         * Add your additional tests below.
         * See part c for more detail.
         */
        System.out.println();
        printPattern('*', 3);
        System.out.println();
        printPattern('$', 6);
        System.out.println();
        System.out.println("area 3 = " + triangleArea(25, 5));
        System.out.println("area 4 = " + triangleArea(50, 3));
        System.out.println();
        
    }
}