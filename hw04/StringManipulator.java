/*
 * StringManipulator.java
 * Calvin Yung (cyung20@bu.edu)
 * 10/15/2013
 * 
 * This program consists of static methods that takes a String
 * to manipulate a given word in multiple different ways.
 */ 

public class StringManipulator {
    /*
     * This method prints each letter of a word with a space after each letter.
     */
    public static void printWithSpaces(String space) {
        for (int i = 0; i < space.length(); i++) {
            System.out.print(space.charAt(i) + " ");
        }
        System.out.println();
    }
    
    /*
     * This method stretches a word by repeating each letter 
     * one more than the previous letter.
     */
    public static void printStretched(String stretch) {
        for (int i = 0; i < stretch.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(stretch.charAt(i));
            }
        }
        System.out.println();
    }
    
    /*
     * This method takes the middle character of a word (if the word has
     * an odd number of letters) or the first letter of the two middle letters
     * (if the word has an even number of letters) and returns it.
     */
    
    public static char middleChar(String middle) {
        int m = (middle.length() - 1) / 2;
        return middle.charAt(m);        
    }
    
    /*
     * This method removes a string from a word. If that string is not found
     * within the word, only the word will be returned.
     */
    public static String removeSubstring(String word, String str) {
        int strIndex = word.indexOf(str);
        if (strIndex == -1) {
            return word;
        }
        String first = word.substring(0, strIndex);
        return first + word.substring(str.length() + strIndex);
    }      
}