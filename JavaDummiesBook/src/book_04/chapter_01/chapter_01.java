package book_04.chapter_01;

import java.util.Scanner;

public class chapter_01 {
//    working with Strings;

//    strings are reference types, not value types;
//    strings are immutable;
//    you can concatenate strings using the + operator;
    public static void main(String[] args) {
        String myName = "Nhlakanipho";

        System.out.println(myName.charAt(3));
        System.out.println(myName.contains("Nhla"));
        System.out.println(myName.startsWith("n"));
         int myNameLength = myName.length();
        System.out.println(myNameLength);

        myName = myName.toUpperCase();
        System.out.println(myName);

        String sudoName = myName.substring(0, 5) + "s".toUpperCase();
        System.out.println(sudoName);

//       split a string based on a delimiter
        String adress = "1500 N Third Street:Fresno:CA:93722";
        String[] parts = adress.split(":");

        for(String part : parts) {
            System.out.println(part);
        }

//        replace parts of a string
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a string");
        String yourString = scanner.nextLine();
        yourString = yourString.replaceAll("cat", "dog");
        System.out.println(yourString);

//        Using string builder and string buffer class
        StringBuilder sb = new StringBuilder("Seize the day");
        sb.append(" bro");
        System.out.println(sb);

    }
}
