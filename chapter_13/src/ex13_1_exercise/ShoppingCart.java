package ex13_1_exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        List<String> dayList = Arrays.asList(days);
        ArrayList<String> dayArrayList = new ArrayList<String>(dayList);

        // Loop through the ArrayList, printing out "sunday" elements in
        //   upper case (use toUpperCase() method of String class)
        for(String day : dayArrayList){
            if(day.equals("sunday")){
                System.out.println(day.toUpperCase());

            }else{
                System.out.println(day.toLowerCase());
            }

        }
        // Print all other days in lower case

        dayArrayList.replaceAll(day -> day.toUpperCase());
        // Print out the ArrayList
        System.out.println(dayArrayList);



    }    
}
