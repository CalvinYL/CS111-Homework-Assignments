/*
 * Card.java
 * 
 * A blueprint class to represent an individual playing card.
 * 
 * starter code by course staff, CS 111, Boston University
 * 
 * completed by: Calvin Yung, cyung20@bu.edu
 *         date: 11/20/2013
 * 
 */

public class Card {
    // constants for the ranks of non-numeric cards
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    // Arrays of strings for the rank names and abbreviations.
    // The name of the rank r is given by RANK_NAMES[r].
    // The abbreviation of the rank r is given by RANK_ABBREVS[r].
    // Note that there is a null value in position 0 of
    // each array, because no card has a rank of 0.
    private static final String[] RANK_NAMES = {
        null, "Ace", "2", "3", "4", "5", "6", 
        "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    private static final String[] RANK_ABBREVS = {
        null, "A", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "J", "Q", "K"
    };
    
    // constants for the suits
    public static final int DIAMONDS = 0;
    public static final int HEARTS = 1;
    public static final int CLUBS = 2;
    public static final int SPADES = 3;
    
    // Arrays of strings for the suit names and abbreviations.
    // The name of the suit s is given by SUIT_NAMES[s].
    // The abbreviation of the suit s is given by SUIT_ABBREVS[s].
    private static final String[] SUIT_NAMES = {
        "Diamonds", "Hearts", "Clubs", "Spades"
    };
    private static final String[] SUIT_ABBREVS = {
        "D", "H", "C", "S"
    };

    private int rank;
    private int suitNum;
    private int value;
    
    /*
     * This method takes the name of a suit as a parameter and it returns the index
     * of the specified suit in the SUIT_NAMES array or -1 if the string passed
     * does not appear in the array.
     */
    private static int getSuitNum(String suit) {
        if (suit.equalsIgnoreCase("DIAMONDS") || suit.equalsIgnoreCase("HEARTS") || 
            suit.equalsIgnoreCase("CLUBS") || suit.equalsIgnoreCase("SPADES")) {
            for (int i = 0; i < SUIT_NAMES.length; i++) {
                if (SUIT_NAMES[i].equalsIgnoreCase(suit)) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    /*
     * Changes the Card object's value.
     */
    public void setValue(int newValue) {
        if (newValue < 1) {
            throw new IllegalArgumentException("value must be positive");    
        }
        this.value = newValue;
    }
    
    /*
     * Returns the Card object's rank
     */
    public int getRank() {
        return this.rank;
    }
    
    /*
     * Returns the Card object's suit number
     */
    public int getSuitNum() {
        return this.suitNum;
    }
    
    /*
     * Returns the Card object's value
     */
    public int getValue() {
        return this.value;
    }
    
    /*
     * Returns the Card object's suit name
     */
    public String getSuit() {
        return SUIT_NAMES[this.suitNum];    
    }
    
    /*
     * Returns the abbreviation of the Card object's suit
     */
    public String getAbbrev() {
        return RANK_ABBREVS[this.rank] + SUIT_ABBREVS[this.suitNum];
    }
    
    /*
     * Returns true if the Card is an Ace and false if it is not
     */
    public boolean isAce() {
        if (RANK_NAMES[rank].equalsIgnoreCase("Ace")) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Returns true if the Card is a face card (Jack, Queen, or King) and
     * false if it is not
     */
    public boolean isFaceCard() {
        if (RANK_NAMES[rank].equalsIgnoreCase("Jack") || RANK_NAMES[rank].equalsIgnoreCase("Queen") 
                || RANK_NAMES[rank].equalsIgnoreCase("King")) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * This constructor takes three int parameters and ensures only valid values
     * are assigned to the object's fields.
     */
    public Card(int iRank, int iSuitNum, int iValue) {
        if (iRank < 1 || iRank > 13 || iSuitNum < 0 || iSuitNum > 3) {
            throw new IllegalArgumentException();
        }
        this.setValue(iValue);
        this.rank = iRank;
        this.suitNum = iSuitNum;
    }
    
    /*
     * This constructor takes two int parameters and assumes that Aces and numeric
     * cards have a value that is equal to their rank, and that face cards have a
     * value of 10.
     */
    public Card(int iRank, int iSuitNum) {
        this(iRank, iSuitNum, 1);
        if (iRank == 11 || iRank == 12 || iRank == 13) {
            this.value = 10;
        } else {
            this.value = iRank;
        }
    }
    
    /*
     * This constructor takes an int and a String parameter to determine the suit number
     * for the specified suit string.
     */
    public Card(int iRank, String suit) {
        this.suitNum = this.getSuitNum(suit);
        this.rank = iRank;
        if (iRank == 11 || iRank == 12 || iRank == 13) {
            this.value = 10;
        } else {
            this.value = iRank;
        }
    }
    
    /*
     * This toString method returns a string in the form of "rank_name of suit_name"
     * by using concatenation.
     */
    public String toString() {
        return RANK_NAMES[this.rank] + " of " + SUIT_NAMES[this.suitNum];
    }
    
    /*
     * This method takes a Card object as a parameter and determines if it has the same suit
     * as the called object, returning true if they have the same suit and false if they don't.
     */
    public boolean sameSuitAs(Card suit) {
        return (suit != null
              && this.suitNum == suit.suitNum);
    }
    
    /*
     * This method takes a Card object as a parameter and determines if it is equivalent to
     * the called object by comparing their ranks and suits, returning true if they are 
     * and false if they are not.
     */
    public boolean equals(Card rankSuit) {
        return (rankSuit != null
              && this.rank == rankSuit.rank
              && this.suitNum == rankSuit.suitNum);
    }
}