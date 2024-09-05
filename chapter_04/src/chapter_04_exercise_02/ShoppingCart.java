package chapter_04_exercise_02;
public class ShoppingCart {
    public static void main(String[] args) {
        //declare and initialize String variables
        String custName = "Nhlakanipho";
        String itemDesc = "Bag";

        double price = 29.99 , tax = 15.0;
        int numOfItems = 5;
        double totalPrice;


//        declare the message vairable
        String message;

        //Assign the message variable
        message = custName + " wants to purchase a " + itemDesc  +  ".";

        totalPrice = price * numOfItems + tax;
        //print and run the code
        System.out.println(message);


//        declare a boolean outOfStock
        boolean outOfStock = false;

        if(numOfItems > 1){
            message = custName + " wants to purchase "+ numOfItems + " " + itemDesc + "s" +  ".";
        }

        if(outOfStock){
            System.out.println("We dont currently have the product you want in stock");
        }else{
            System.out.println(message);
            System.out.println("total price is " + totalPrice);
        }

    }
}
