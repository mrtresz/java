package ex09_1_exercise;


public class Customer {
    private String name;
    private String ssn;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getSsn(){
        return ssn;
    }
   
    // Encapsulate this class.  Make ssn read only.
 
}
