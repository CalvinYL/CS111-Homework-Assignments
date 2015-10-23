/*
 * BlockLetterWriter.java
 * Calvin Yung (cyung20@bu.edu)
 * 
 * This program displays the phrase "DA DOO RON RON" in block letters on the console.
 * This program uses procedural decomposition to demonstrate how static methods
 * are used to create the phrase "DA DOO RON RON".
 */

public class BlockLetterWriter {
    /*
     * writeL - outputs two vertical bars ("|") with five spaces between the bars
     */
    public static void writeL() {
        System.out.println("|     |");
    }
    
    /*
     * write D - outputs a block letter 'D' to the console
     */
    public static void writeD() {
        System.out.println("-----");
        System.out.println("|    \\");
        writeL();
        writeL();
        writeL();
        System.out.println("|    /");
        System.out.println("-----");
    }
    
    /*
     * write A - outputs a block letter 'A' to the console
     */
    public static void writeA() {
        System.out.println("+-----+");
        writeL();
        writeL();
        System.out.println("+-----+");
        writeL();
        writeL();
        writeL();
    }
    
    /*
     * write O - outputs a block letter 'O' to the console
     */
    public static void writeO() {
        System.out.println("+-----+");
        writeL();
        writeL();
        writeL();
        writeL();
        writeL();
        System.out.println("+-----+");
    }
    
    /*
     * write N - outputs a block letter 'N' to the console 
     */
    public static void writeN() {
        writeL();
        System.out.println("|\\    |");
        System.out.println("| \\   |");
        System.out.println("|  \\  |");
        System.out.println("|   \\ |");
        System.out.println("|    \\|");
        writeL();
    }
    
    /*
     * write R - outputs a block letter 'R' to the console
     * followed by the letters 'O' and 'N'.
     */
    public static void writeR() {
        System.out.println("+----");
        System.out.println("|    \\");
        writeL();
        System.out.println("|____/");
        System.out.println("|  \\");
        System.out.println("|   \\");
        System.out.println("|    \\");
        System.out.println();
        writeO();
        System.out.println();
        writeN();
    }
    
    /*
     * The main outputs the phrase "DA DOO RON RON" to the console.
     */
    public static void main(String[] args) {
        writeD();
        System.out.println();
        writeA();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        writeD();
        System.out.println();
        writeO();
        System.out.println();
        writeO();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        writeR();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        writeR();
        System.out.println();
    }
}
