package ex11_4_exercise;
import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> provinces = new ArrayList();
        provinces.add("mpumalanga");
        provinces.add(1,"western cape");
        provinces.add(2,"gauteng");
        System.out.println(provinces);




        
        // add (insert) another element at a specific index
    provinces.add(1,"eastern cape");
        System.out.println(provinces);

	// Check for the existence of a specific String element.
       boolean exists = provinces.contains("eastern cape");
        //   If it exists, remove it.
        if(exists){
            provinces.remove("eastern cape");
        }
        System.out.println(provinces);
    }
}
