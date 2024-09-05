
package chapter_08;

public class ShoppingCart {

     public static void main(String args[]) {
          // Declare and initialize 2 Item objects
          Item item1 = new Item();
          Item item2 = new Item();

          item1.id = 1;
          item1.description = "t shirt";
          item1.price = 200;
          item1.quantity = 2;
          item1.setColor('H');

          item2.id = 2;
          item2.description = "trouser";
          item2.price = 300;
          item2.quantity = 1;

	// Print both item descriptions and run code.
          System.out.println("Item 1: " + item1.id + " " + item1.description + " " + item1.price + " " + item1.quantity);
          System.out.println("Item 2: " + item2.id + " " + item2.description + " " + item2.price + " " + item2.quantity);
	// Assign one item to another and run it again.

          item2 = item1;

          String val = "2";
          int numVal = Integer.parseInt(val);

          System.out.println("Item 1: " + item1.id + " " + item1.description + " " + item1.price + " " + item1.quantity);
          System.out.println("Item 2: " + item2.id + " " + item2.description + " " + item2.price + " " + item2.quantity);

     }
 
} 
