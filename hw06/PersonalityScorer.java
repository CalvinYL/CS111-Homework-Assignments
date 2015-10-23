/*
 * PersonalityScorer.java
 * 
 * Calvin Yung (cyung20@bu.edu)
 * 11/07/2013
 * 
 * This program scores responses to the Myers-Briggs personality test
 * and uses a person's results to determine his/her personality type.
 */

import java.util.*;
import java.io.*;
public class PersonalityScorer {    
    
    // Letters for the left-hand side of each personality component.
    public static final String[] LEFT_HAND_LETTERS =  {"E", "S", "T", "J"};
    
    // Letters for the right-hand side of each personality component.
    public static final String[] RIGHT_HAND_LETTERS = {"I", "N", "F", "P"};
    
    /*
     * This method takes the name and results of subjects from a given
     * file, prints their names, and converts their results into an array
     * of letters. It then calls on one method to count up how many
     * As or Bs are in each component and then another method to print
     * out the personality type based on the distribution of the As and Bs
     * in their respective arrays.
     */
    public static void answers(String fileName) 
      throws FileNotFoundException { 
        Scanner input = new Scanner(new File(fileName));
        
        while (input.hasNextLine()) {
            int[] Acounts = new int[4];
            int[] Bcounts = new int[4];
            String name = input.nextLine();
            System.out.println(name);
            String answerString = input.nextLine();
            char[] answers = answerString.toCharArray();
            
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == 'A') {
                    Acounts[counts(i)]++;
                } else if (answers[i] == 'B') {
                    Bcounts[counts(i)]++;
                } 
            }
            
            printPersonality(Acounts, Bcounts);
        }   
    }
    
    /*
     * This method takes the index of the number in the array of
     * the results passed in by the answers method and determines 
     * which component they belong to by dividing the number by 7. 
     * This method then returns a number that corresponds to that component.
     */
    public static int counts(int i) throws FileNotFoundException {
        if (i % 7 == 0) {
            return 0;
        } else if (i % 7 == 1 || i % 7 == 2) {
            return 1;
        } else if (i % 7 == 3 || i % 7 == 4) {
            return 2;
        } else {
            return 3;
        }
    }
    
    /*
     * This method takes the arrays Acounts and Bcounts that is passed
     * from the answers method and prints what type of personality
     * the person has based on their results.
     */
    public static void printPersonality(int[] Acounts, int[] Bcounts) 
      throws FileNotFoundException {
        for (int j = 0; j < 4; j++) {
            System.out.print(Acounts[j] + "A-" + Bcounts[j] + "B ");
        }
        System.out.print("= ");
        for (int i = 0; i < 4; i++) {
            if (Acounts[i] > Bcounts[i]) {
                System.out.print(LEFT_HAND_LETTERS[i]);
            } else if (Acounts[i] < Bcounts[i]) {
                System.out.print(RIGHT_HAND_LETTERS[i]);
            } else {
                System.out.print("X");
            }
        }
        System.out.println();      
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Name of file: ");
        String fileName = console.next();
        answers(fileName);
    }
}
