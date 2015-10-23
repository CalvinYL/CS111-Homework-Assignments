/*
 * DrawZakim2.java
 * By Calvin Yung (cyung20@bu.edu)
 * 10/02/2013
 * 
 * This program uses scale factor to change the size output
 * of the tower depending on whatever value is inputted.
 */

public class DrawZakim2 {
    public static final int SCALE_FACTOR = 3;
    /* 
     * prints a forward slash ("/")
     */
    public static void drawFslash() {
        System.out.print("/");
    }
    
    /* 
     * Prints a back slash ("\")
     */
    public static void drawBslash() {
        System.out.print("\\");
    }
    
    /* 
     * Prints an open curly brace ("{")
     */
    public static void drawObrace() {
        System.out.print("{");
    }
    
    /*
     * Prints a close curly brace ("}")
     */
    public static void drawCbrace() {
        System.out.print("}");
    }
    
    /*
     * Prints a space (" ")
     */
    public static void space() {
        System.out.print(" ");
    }
    
    /*
     * Prints a line ("|")
     */
    public static void line() {
        System.out.print("|");
    }
    
    /*
     * Prints the very tip of the tower
     */
    public static void drawSpire() {                          
        for (int line = 1; line <= SCALE_FACTOR; line++) {
            // spaces to the left of the tower's tip
            for (int i = 0; i < 8 * SCALE_FACTOR - line; i++) {
                space();
            }    
            // forward slashes (/) of the tower's tip
            for (int i = 0; i < line; i++) {
                drawFslash();
            }
            line();
            // back slashes (\) of the tower's tip
            for (int i = 0; i < line; i++) {
                drawBslash();
            }
            System.out.println();
        }
    }
    
    /*
     * Prints the vertical spiral of the tower
     */
    public static void drawTop() {                            
        for (int line = 1; line <= SCALE_FACTOR; line++) {
            // spaces to the left of the tower's tip
            for (int i = 0; i < 7 * SCALE_FACTOR; i++) {
                space();
            }
            line();
            for (int i = 0; i < SCALE_FACTOR - 1; i++) {
                System.out.print(":");
            }
            line();
            for (int i = 0; i < SCALE_FACTOR - 1; i++) {
                System.out.print(":");
            }
            line();
            System.out.println();
        }
    }
    
    /*
     * Prints the five hyphens beam between each |:|:|
     */
    public static void drawBeam() {
        for (int line = 1; line <= 1; line++) {
            // spaces to the left of the tower's tip
            for (int i = 0; i < 7 * SCALE_FACTOR; i++) {
                space();
            }
            // beam -----
            for (int i = 0; i < 2 * SCALE_FACTOR +1; i++) {
                System.out.print("-");
            } 
            System.out.println();
        }   
    }
    
    /*
     * Prints the beam before the tower begins going diagonally
     */
    public static void sBeam() {
        for (int line = 1; line <= 1; line++) {
            for (int i = 0; i < 7 * SCALE_FACTOR - 1; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * SCALE_FACTOR + 1; i++) {
                System.out.print("-");
            }
            drawBslash();  
            System.out.println();
        }
    }
    
    /*
     * Prints the upper middle portion of tower
     */
    public static void drawMiddleTop() {                         
        for (int line = 1; line <= 2 * SCALE_FACTOR - 1; line++) {                  
            for (int i = 0; i < 7 * SCALE_FACTOR - 1 - line; i++) {                
                space();                            
            }
            drawFslash();
            // open curly brace
            for (int i = 0; i < line + SCALE_FACTOR; i++) {
                drawObrace();
            }
            System.out.print("|");
            // close curly brace
            for (int i = 0; i < line + SCALE_FACTOR; i++) {
                drawCbrace();
            }
            drawBslash();
            System.out.println();
        }
    }
    
    /*
     * Prints the lower Middle portion of tower
     */
    public static void drawMiddleBot() {                        
        for (int line = 1; line <= SCALE_FACTOR; line++) {
            for (int i = 0; i < 5 * SCALE_FACTOR - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * SCALE_FACTOR - 1; i++) {
                drawObrace();
            }
            drawFslash();
            for (int i = 0; i < 2 * line + 2 * SCALE_FACTOR - 1; i++) {         
                space();
            }
            drawBslash();
            for (int i = 0; i < 2 * SCALE_FACTOR -1; i++) {
                drawCbrace();
            }
            drawBslash();
            System.out.println();
        }
    }
    
    /*
     * Prints the top half of the Y and part of the tower's legs
     */
    public static void drawTopY() {                             
        for (int line = 1; line <= 2 * SCALE_FACTOR; line++) {
            for (int i = 0; i < 4 * SCALE_FACTOR - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * SCALE_FACTOR - 1; i++) {
                drawObrace();
            }
            drawFslash();
            for (int i = 0; i < 2 * line - 2; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < -2 * line + 4 * SCALE_FACTOR + 1; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * line - 2; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < 2 * SCALE_FACTOR - 1; i++) {
                drawCbrace();
            }
            drawBslash();
            System.out.println();
        }
    }
    
    /*
     * Prints the bottom half of the Y and part of the tower's legs
     */
    public static void drawBotY() {                          
        for (int line = 1; line <= 2 * SCALE_FACTOR; line++) {
            for (int i = 0; i < 2 * SCALE_FACTOR - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * SCALE_FACTOR - 1; i++) {
                drawObrace();
            }
            drawFslash();
            for (int i = 0; i < 4 * SCALE_FACTOR - 1 + line; i++) {
                space();
            }
            System.out.print("|");
            for (int i = 0; i < 4 * SCALE_FACTOR - 1 + line; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < 2 * SCALE_FACTOR - 1; i++) {
                drawCbrace();
            }
            drawBslash();
            System.out.println();
        }
    }
    
    /* 
     * Prints the foundation of tower (the last line)
     */ 
    public static void foundation() {                           
        for (int i = 0; i < 2 * SCALE_FACTOR; i++) {
            System.out.print("=");
        }
        for (int line = 0; line < 6 * SCALE_FACTOR; line++) {
            space();
        }
        System.out.print("=");
        for (int i = 0; i < 6 * SCALE_FACTOR; i++) {
            space();
        }
        for (int i = 0; i < 2 * SCALE_FACTOR; i++) {
            System.out.print("=");
        }
    }
    
    /*
     * Main method that calls the other methods to create the tower
     */
    public static void main(String[] args) {                    //main tool
        drawSpire();
        drawTop();
        drawBeam();
        drawTop();
        drawBeam();
        drawTop();
        sBeam();
        drawMiddleTop();
        drawMiddleBot();
        drawTopY();
        drawBotY();
        foundation();
        
    }
}