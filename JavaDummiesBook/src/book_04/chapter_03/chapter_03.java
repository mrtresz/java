package book_04.chapter_03;

import java.util.ArrayList;

public class chapter_03 {
    public static void main(String[] args) {
//        Using the ArrayList Class;
//        array list is a resizable array and it can only store reference data types

//        if you want to store primitive types like int You need to use the wrapper class

        ArrayList<String> names = new ArrayList<String>();

//        adding elements
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        names.set(0,"Nhlakanipho");

        names.remove(3);
        names.clear(); //removes the references  to the objects from the array

//        remove range(4,7);
//        displaying the items of our array list
        for(String name : names){
            System.out.println(name);
        }

    }
}
