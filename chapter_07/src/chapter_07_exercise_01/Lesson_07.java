package chapter_07_exercise_01;
import java.util.Scanner;

public class Lesson_07 {
    public static void main(String[] args) {





        String name  = "Nhlakanipho";
        int length = name.length();
        System.out.println(name +" "+ "has " +  length + " characters");

        String lastName = "Zulu";
        System.out.println("fullname: " +  name + " " + lastName);



//        String greet = "Hello";
//        greet = greet.trim();
//        System.out.println(greet);

        String greet = " HOW ".trim();
        String lc = greet + "DY".toLowerCase();
        System.out.println(lc);

        String phoneNum = "071-313-9270".replace("-","");
        System.out.println(phoneNum);
        int number = Integer.parseInt(phoneNum);
        System.out.println(number);

        StringBuilder builder = new StringBuilder();



    }

}
