/*
 * StringRecursion.java
 *
 * starter code by: Computer Science 111, Boston University
 * 
 * modified by: Calvin Yung
 * username: cyung20@bu.edu
 *
 * A class that contains recursive methods that operate on strings.
 */

public class StringRecursion {
    /* 
     * You may want to add test code for your methods to this
     * main method, although doing so is not required. 
     * See the section of the assignment entitled
     * "Testing your methods".
     * 
     * IMPORTANT: If your method does not return anything
     * (i.e., it is a void method), you should NOT try
     * to call it from within a println command. Instead,
     * you should call it on its own line -- for example:
     *     printSeries(3, 8);
     */
    public static void main(String[] args) {
        System.out.println("test 1 gives: " + numOccur('s', "Mississippi"));
        System.out.println("test 2 gives: " + numOccur('e', "Mississippi"));                   
        System.out.println("test 3 gives: " + removeVowels("Mississippi"));
        System.out.println("test 4 gives: " + removeVowels("apple"));  
        System.out.println();
        printWithSpaces("method");
        System.out.println();
        printDecreaseIncrease("method");
        System.out.println();
        String x = shiftChars("aeiou", 1);
        String y = shiftChars("HELLO", 3); 
        String z = shiftChars("HELLO", -1);
        System.out.println(x);             // "bfjpv"
        System.out.println(y);             // "KHOOR"
        System.out.println(z);             // "GDKKN"
        System.out.println();
        boolean a = endsWith("recursion", "ion");
        boolean b = endsWith("recursion", "lion");
        boolean c = endsWith("ion", "recursion");
        System.out.println(a);             // true
        System.out.println(b);             // false
        System.out.println(c);             // false
        System.out.println();
        
    }
    
    /*
     * numOccur - a recursive method that returns the number of times 
     * that the character ch occurs in the String str.
     * 
     * The main method includes two examples of using this method.
     *
     * You can also test this method by entering
     * StringRecursion.numOccur(ch, str) -- where ch is replaced 
     * by a char and str is replaced by a string -- in the 
     * Interactions Pane.
     */
    public static int numOccur(char ch, String str) {
        // base case
        if (str == null || str.equals("")) {
            return 0;
        }
    
        // recursive case
        int numOccurInRest = numOccur(ch, str.substring(1));
        if (ch == str.charAt(0)) {
            return 1 + numOccurInRest;
        } else {
            return numOccurInRest;
        }
    }

    /*
     * removeVowels - a recursive method that creates the String
     * that results from removing vowels from the String str.
     * 
     * The main method includes two examples of using this method.
     *
     * You can also test this method by entering
     * StringRecursion.removeVowels(str) -- where str is replaced
     * by a string -- in the Interactions Pane.
     * 
     * NOTE: There are examples of debugging printlns included below,
     * but they have been commented out.
     */
    public static String removeVowels(String str) {
        // System.out.println("starting removeVowels(" + str + ")");
        if (str == null || str.equals("")) {
            // System.out.println("removeVowels(" + str + ") returns " + str);
            return str;
        }
        
        String removedFromRest = removeVowels(str.substring(1));
        char first = str.charAt(0);
        
        // We assume that the string is all lowercase.
        if (first == 'a' || first == 'e' || first == 'i'
           || first == 'o' || first == 'u') {
            // System.out.println("removeVowels(" + str + ") returns " + removedFromRest);
            return removedFromRest;
        } else {
            // System.out.println("removeVowels(" + str + ") returns " + (first + removedFromRest));
            return first + removedFromRest;
        }
    }
    
    /*
     * Prints a word with spaces in between each letter.
     */ 
    public static void printWithSpaces(String str) {
        if (str == null || str.equals("")) {
            System.out.println();
        } else {
            int i = 0;
            System.out.print(str.charAt(i) + " ");
            i++;
            printWithSpaces(str.substring(1));
        }
    }
    
    /*
     * This method takes a word and prints it multiple times on individual lines
     * by removing the last letter from the word until it is just one
     * letter and then adding letters chronologically until the word
     * is back to how it was.
     */
    public static void printDecreaseIncrease(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
            System.out.println(str.substring(0, str.length()));
            printDecreaseIncrease(str.substring(0, str.length() - 1));
            System.out.println(str.substring(0, str.length()));
        }
    }
    
    /*
     * This method takes a string of letters and shifts those letters
     * accordingly to the inputted number in offset
     */
    public static String shiftChars(String str, int offset) {
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            return "";
        } 
        String letter = shiftChars(str.substring(1), offset);
        char ch = str.charAt(0);
        char shiftedChar = (char)(ch + offset);
        return shiftedChar + letter;
    }
    
    /*
     * This method returns a true or false depending on if the specified
     * string parameter ends with the inputted suffix.
     */
    public static boolean endsWith(String str, String suffix) {
        if (str == null || str.length() == 0) {
            return false;      
        }
        if (suffix.length() == 0) {
            return true;
        }
        if (str.charAt(str.length() - 1) == suffix.charAt(suffix.length() - 1)) {
            return endsWith(str.substring(0, str.length() - 1), suffix.substring(0, suffix.length() - 1));
        } else {
            return false;
        }
    }
    
    /*
     * This method locates the inputted index of the word and 
     * returns the index of the inputted character.
     */
    public static int indexOf(char ch, String str, int fromIndex) {    
        if (fromIndex < 0) {
            throw new IllegalArgumentException("index cannot be negative");
        }
        if (str == null || str.equals("") || fromIndex >= str.length()) {
            return -1;
        }
        
        int letter = indexOf(ch, str.substring(1), fromIndex + 1);
        if (str.charAt(fromIndex) != ch) {
            return letter;
        } else {
            return letter + 1;
        }
        
        
        
        
        
    
    
    }

}
    
    
    
    
    
    
    
    
    
