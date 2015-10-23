public class Person {
    private String name;
    private Date dob;
    
    /*
     * This constructor takes a String for a Person's name and a Date for the
     * person's date of birth and ensures that a null or empty string cannot be
     * passed into the parameters.
     */
    public Person(String iName, Date iDob) {
        if (iName == null || iName.equals("") || iDob == null) {
            throw new IllegalArgumentException();
        }
        this.name = iName;
        this.dob = iDob;
    }
    
    /*
     * Returns the Person's name as a String.
     */
    public String getName() {
        return this.name;
    }
    
    /*
     * Returns the Person's date of birth as a Date.
     */
    public Date getDOB() {
        return this.dob;
    }
    
    /*
     * Takes an integer parameter representing a year, and creates and 
     * returns a Date object representing the date on which the person's 
     * birthday falls in that year.
     */
    public Date getBirthdayIn(int year) {
        Date d1 = new Date(dob.getMonth(), dob.getDay(), year);
        return d1;
    }
    
    /*
     * Takes a parameter of type Date and returns an integer representing the
     * person's age in years on that date.
     */
    public int getAgeOn(Date d) {
        if (d.isBefore(this.dob)) {
            throw new IllegalArgumentException();
        }
        
        Date dob2 = getBirthdayIn(d.getYear());
        if (d.isBefore(dob2)) {
            return (d.getYear() - dob.getYear() - 1);
        } else {
            return (d.getYear() - dob.getYear());
        }
    }
    
    /*
     * Returns a String representation of a Person object. The returned String
     * has the form "name (born on dob)"; dob represents that person's date of birth. 
     */
    public String toString() {
        return this.name + " (born on " + dob.toString() + ")";
    }
    
}
            