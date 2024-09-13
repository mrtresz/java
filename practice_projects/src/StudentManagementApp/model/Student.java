package StudentManagementApp.model;

public class Student {
    private int rollNumber;
    private String firstName;
    private String collegeName;
    private String city;
    private double percentage;

    Student(){



    }

    public Student(double percentage, String city, String collegeName, String firstName, int rollNumber) {
        this.percentage = percentage;
        this.city = city;
        this.collegeName = collegeName;
        this.firstName = firstName;
        this.rollNumber = rollNumber;
    }

    public Student(double percentage, String city, String collegeName, String firstName) {
        this.percentage = percentage;
        this.city = city;
        this.collegeName = collegeName;
        this.firstName = firstName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", collegeName=" + collegeName + ", city=" + city + ", percentage=" + percentage + "]";
    }
}
