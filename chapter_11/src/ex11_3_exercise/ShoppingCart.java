
package ex11_3_exercise;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
   public double calculateTotal(){
        double total = 0;
        for(int i = 0; i < items.length; i++){
            total += items[i].getPrice();
        return total;
        }
       return total;
   }
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = calculateTotal();
        System.out.println("The total is: " + total);
    }
}
