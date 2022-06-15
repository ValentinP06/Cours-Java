package poo15juin.Exercice2;

public class Human {

    private String firstName;
    private String lastName;
    private String country;
    private boolean married;
    private int numberOfKids;
    public Human(String firstName, String lastName, String country, boolean married, int numberOfKids) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = married;
        this.numberOfKids = numberOfKids;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }


    public String fullDescription() {

        String tempStr = String.format("You are %s %s, living in %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married ? "married" : "not married",
                numberOfKids);

        return tempStr;

    }


}
