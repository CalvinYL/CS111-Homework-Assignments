/*
 * DrawZakim.java
 * By Calvin Yung (cyung20@bu.edu)
 * 10/02/2013
 * 
 * This program uses multiple nested loops as well
 * as procedural decomposition in order to print
 * a drawing of the Zakim Bridge.
 */

public class DrawZakim {
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
        for (int line = 1; line <= 2; line++) {
            // spaces to the left of the tower's tip
            for (int i = 0; i < 16 - line; i++) {
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
        for (int line = 1; line <= 2; line++) {
            // spaces to the left of the tower's tip
            for (int i = 0; i < 14; i++) {
                space();
            }
            line();
            for (int i = 0; i < 1; i++) {
                System.out.print(":");
            }
            for (int i = 0; i < 1; i++) {
                line();
            }
            for (int i = 0; i < 1; i++) {
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
            for (int i = 0; i < 14; i++) {
                space();
            }
            // beam -----
            for (int i = 0; i < 5; i++) {
                System.out.print("-");
            } 
            System.out.println();
        }   
    }
    
    /*
     * Prints the beam before the tower begins going diagonally
     */
    public static void sBeam() {
        for (int line = 1; line <=1; line++) {
            for (int i = 0; i < 13; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 5; i++) {
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
        for (int line = 1; line <= 3; line++) {                  
            for (int i = 0; i < 13 - line; i++) {                
                space();                            
            }
            drawFslash();
            // open curly brace
            for (int i = 0; i < line + 2; i++) {
                drawObrace();
            }
            System.out.print("|");
            // close curly brace
            for (int i = 0; i < line + 2; i++) {
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
        for (int line = 1; line <= 2; line++) {
            for (int i = 0; i < 10 - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 3; i++) {
                drawObrace();
            }
            drawFslash();
            
            for (int i = 0; i < 2 * line + 3; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < 3; i++) {
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
        for (int line = 1; line <= 4; line++) {
            for (int i = 0; i < 8 - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 3; i++) {
                drawObrace();
            }
            drawFslash();
            for (int i = 0; i < 2 * line - 2; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < -2 * line + 9; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 2 * line - 2; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < 3; i++) {
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
        for (int line = 1; line <= 4; line++) {
            for (int i = 0; i < 4 - line; i++) {
                space();
            }
            drawFslash();
            for (int i = 0; i < 3; i++) {
                drawObrace();
            }
            drawFslash();
            for (int i = 0; i < line + 7; i++) {
                space();
            }
            System.out.print("|");
            for (int i = 0; i < line + 7; i++) {
                space();
            }
            drawBslash();
            for (int i = 0; i < 3; i++) {
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
        for (int i = 0; i < 4; i++) {
            System.out.print("=");
        }
        for (int line = 0; line < 12; line++) {
            space();
        }
        System.out.print("=");
        for (int i = 0; i < 12; i++) {
            space();
        }
        for (int i = 0; i < 4; i++) {
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