package ex12_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item myShirt = new Shirt(59.99, 'S', 'B');
        
        // call the display method on the object, then the getColor method
        myShirt.display();
    }
}
