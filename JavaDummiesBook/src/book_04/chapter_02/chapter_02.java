package book_04.chapter_02;

import java.util.Arrays;
import java.util.Scanner;

public class chapter_02 {
//    using arrays

//    an array is a set of variables that is referenced by using a single variable name combined with an index number;
//    an array itself is an object;
//    an array has a fixed length
    ;
    public static void main(String[] args) {
//        creating arrays
        String[] names; //this doesnt create the array only declares it;

        int[] nums = new int[10]; //this declares and creates a new array;
//        initializing the elements of an array;
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 5;
        nums[4] = 6;

//        or we can use a shorthand to create and initialize array;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",};

//        using for loops with array
//        an example with a loop that fills an array of players with string entered by the user;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players are in the team?");
        int count = sc.nextInt();
        sc.nextLine();
        String[] players = new String[count];
        for(int i = 0; i < count; i++){
            System.out.println("Enter player name");
            players[i] = sc.nextLine();

        }
        System.out.println(Arrays.toString(players));
//

//        using an enhanced for loop;
        /*
        for (type identifier : array){
            Statements
            }
         */

        for(String d : days){
            System.out.println(d);
        }

//        calling printStringArray method;
//    printStringArray(players);

//
    }
    //        using arrays with methods;
    public static String[] getDaysOfWeek(){
            String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday",};
            return daysOfWeek;
        }

    public static void printStringArray(String[] array){
        for(String s : array){
            System.out.println(s);
        }
    }

//    two-dimensional arrays
    double[][] sales = new double[10][10];


}
