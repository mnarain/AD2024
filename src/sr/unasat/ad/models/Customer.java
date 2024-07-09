package sr.unasat.ad.models;

public class Customer {
    private String firstName;
    private String lastName;

    //constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //create method that returns the initials capitalized
    public String getInitials() {
        return this.firstName.substring(0, 1).toUpperCase() + this.lastName.substring(0, 1).toUpperCase();
    }
}
