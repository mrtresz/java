package book_02.chapter_02;
import java.util.Scanner;

public class chapter_02 {
//    working with variables and data types


    public static void main(String[] args) {
//    syntax for declaring variable
//    type identifier;
        int x;
        String studentName;
        double price;

//        declaring 2 or more variable
        int sum,quantity;

//        class variables must include the word static in the declaration, and they are declared outside the method in the class block
//        ex. static String helloMessage;

//        instance variables - instance variable are declared in the class block outside the methods of a class
//        instance only work with object , so they won't compile if used in a static method

//        local variables - A local variable is a variable that is declared within the body of a method
//        local variable only exists in the context of a method
//        local variable must be declared above the statement that uses them

//        initializing variables
        String myName = "Nhlakanipho";
        studentName = myName;

//        using final variables - a constant is a variable whose value you can't change after it's been initialized
        final int WEEKDAYS = 7;


//        primitive data types
//          -primitive types are the data types defined by the language itself
//        reference types
//          -are types defined by classes in the java API or classes you create

//        the primitive types
//        - int, short, long, byte, float, double, char, boolean

//        wrapper classes
//        wrapper classes - wrap primitive types and make them behave as objects
//        Integer, Short, Long, Byte, Float, Double, Character, Boolean

//        using reference type
//        syntax: type identifier = new type()

//        to access methods and fields of the using the reference we use it with the dot operator

//        Working with Strings;
//        strings in java are objects
//        String name = new String

//        methods that convert Strings to numeric
//        int x = Integer.parseInt("100")

//        casting
//        double pi - 3.1314;
//        int iPi;
//        iPi = (int) pi;

//        Getting input with scanner class

//        importing scanner
//        import java.util.Scanner


//        using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = sc.nextLine();

        System.out.println("Hello" + " " + yourName);

//        scanner class methods that check for valid input values;
//         hasNextBoolean(), hasNextInt() ...etc they return a boolean

//        using enum to create your own data types
//        public enum CardSuit {
//                HEARTS, SPACES, CLUBS, DIAMONDS
//            }

    }
}
