
package ex11_2_exercise;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        // Parse the args array to populate name and age.
        args = sc.nextLine().split(" ");

	    // Print an error message if fewer than 2 args are passed in.
        if(args.length < 2){
            System.out.println("Error !! .Enter two or more arguments");
        }


        
    }
}
